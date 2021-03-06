/*
 * This file is part of Popcorn Time.
 *
 * Popcorn Time is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Popcorn Time is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Popcorn Time. If not, see <http://www.gnu.org/licenses/>.
 */

package pct.droid.base.torrent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class TorrentBroadcastReceiver extends BroadcastReceiver {

    public static final String STOP = "pct.droid.base.torrent.TorrentBroadcastReceiver.STOP";
    public static final Integer REQUEST_CODE = 21412;

    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals(STOP)) {
            TorrentService.stop();
        }
    }

}
