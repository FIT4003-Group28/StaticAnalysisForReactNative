package defpackage;

import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.populous.PopulousChannel;
/* compiled from: PG */
/* renamed from: cxsb  reason: default package */
/* loaded from: classes5.dex */
public final class cxsb {
    final String a;
    final Channel b;
    cygg c;

    public cxsb(String str, Channel channel, boolean z) {
        cygf cygfVar;
        this.a = str;
        this.b = channel;
        cyge c = cygg.c();
        PopulousChannel populousChannel = (PopulousChannel) channel;
        int i = populousChannel.b;
        if (i == 1) {
            cygfVar = z ? cygf.IN_APP_EMAIL : cygf.EMAIL;
        } else if (i == 2) {
            cygfVar = z ? cygf.IN_APP_PHONE : cygf.PHONE_NUMBER;
        } else {
            throw new IllegalArgumentException("ContactMethodType can only be either email or phone.");
        }
        c.c(cygfVar);
        c.b(populousChannel.a);
        this.c = c.a();
    }
}
