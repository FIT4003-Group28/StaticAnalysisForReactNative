package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Build;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import org.webrtc.Logging;
import org.webrtc.NetworkChangeDetector$ConnectionType;
import org.webrtc.NetworkChangeDetector$IPAddress;
import org.webrtc.NetworkChangeDetector$NetworkInformation;
/* compiled from: PG */
/* renamed from: banv  reason: default package */
/* loaded from: classes2.dex */
public final class banv extends BroadcastReceiver {
    public final Context a;
    public NetworkChangeDetector$NetworkInformation b;
    private final bano c;

    public banv(bano banoVar, Context context) {
        this.a = context;
        this.c = banoVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.p2p.STATE_CHANGED");
        intentFilter.addAction("android.net.wifi.p2p.CONNECTION_STATE_CHANGE");
        context.registerReceiver(this, intentFilter);
        if (Build.VERSION.SDK_INT > 28) {
            WifiP2pManager wifiP2pManager = (WifiP2pManager) context.getSystemService("wifip2p");
            wifiP2pManager.requestGroupInfo(wifiP2pManager.initialize(context, context.getMainLooper(), null), new WifiP2pManager.GroupInfoListener() { // from class: banu
                @Override // android.net.wifi.p2p.WifiP2pManager.GroupInfoListener
                public final void onGroupInfoAvailable(WifiP2pGroup wifiP2pGroup) {
                    banv.this.a(wifiP2pGroup);
                }
            });
        }
    }

    public final void a(WifiP2pGroup wifiP2pGroup) {
        if (wifiP2pGroup == null || wifiP2pGroup.getInterface() == null) {
            return;
        }
        try {
            ArrayList list = Collections.list(NetworkInterface.getByName(wifiP2pGroup.getInterface()).getInetAddresses());
            NetworkChangeDetector$IPAddress[] networkChangeDetector$IPAddressArr = new NetworkChangeDetector$IPAddress[list.size()];
            for (int i = 0; i < list.size(); i++) {
                networkChangeDetector$IPAddressArr[i] = new NetworkChangeDetector$IPAddress(((InetAddress) list.get(i)).getAddress());
            }
            NetworkChangeDetector$NetworkInformation networkChangeDetector$NetworkInformation = new NetworkChangeDetector$NetworkInformation(wifiP2pGroup.getInterface(), NetworkChangeDetector$ConnectionType.CONNECTION_WIFI, NetworkChangeDetector$ConnectionType.CONNECTION_NONE, 0L, networkChangeDetector$IPAddressArr);
            this.b = networkChangeDetector$NetworkInformation;
            this.c.a(networkChangeDetector$NetworkInformation);
        } catch (SocketException e) {
            Logging.c("NetworkMonitorAutoDetect", "Unable to get WifiP2p network interface", e);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(intent.getAction())) {
            a((WifiP2pGroup) intent.getParcelableExtra("p2pGroupInfo"));
        } else if (!"android.net.wifi.p2p.STATE_CHANGED".equals(intent.getAction()) || intent.getIntExtra("wifi_p2p_state", 0) != 1) {
        } else {
            this.b = null;
            this.c.b(0L);
        }
    }
}
