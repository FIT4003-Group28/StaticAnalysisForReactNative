package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import com.google.android.libraries.social.peoplekit.chips.viewcontrollers.ChannelChip;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
/* compiled from: PG */
/* renamed from: cxpb  reason: default package */
/* loaded from: classes5.dex */
public final class cxpb implements Runnable {
    final /* synthetic */ Channel a;
    final /* synthetic */ cxpc b;

    public cxpb(cxpc cxpcVar, Channel channel) {
        this.b = cxpcVar;
        this.a = channel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        cxpn cxpnVar = this.b.a;
        Channel channel = this.a;
        for (cxqh cxqhVar : cxpnVar.t) {
            if (cxqhVar.b.a().equals(channel) && (activity = cxqhVar.c) != null && !activity.isDestroyed() && !cxqhVar.c.isFinishing()) {
                cxqhVar.m = channel.i(cxqhVar.c);
                if (!TextUtils.isEmpty(cxqhVar.m) || !TextUtils.isEmpty(channel.b(cxqhVar.c))) {
                    ChannelChip channelChip = cxqhVar.b;
                    String str = cxqhVar.m;
                    String b = channel.b(cxqhVar.c);
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(b).length());
                    sb.append(str);
                    sb.append(", ");
                    sb.append(b);
                    channelChip.setContentDescription(sb.toString());
                }
                cxqhVar.b(channel);
            }
        }
    }
}
