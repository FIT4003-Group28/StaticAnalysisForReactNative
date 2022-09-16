package defpackage;

import java.io.IOException;
import java.net.MulticastSocket;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adbr  reason: default package */
/* loaded from: classes.dex */
public final class adbr implements Runnable {
    final /* synthetic */ adbs a;

    public adbr(adbs adbsVar) {
        this.a = adbsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yrf a = this.a.c.a();
        if (a == null) {
            afus.b(2, 21, "failed to obtain a wifi network interface, not sending wol packet to device");
            return;
        }
        MulticastSocket a2 = ((adbp) this.a.d).a(a, null);
        if (a2 == null) {
            afus.b(2, 21, "failed to create a multicast socket, not sending wol packet to device");
            return;
        }
        try {
            a2.send(this.a.g);
        } catch (IOException e) {
            zep.f(adbs.a, "Error sending Magic packet", e);
        } catch (NumberFormatException e2) {
            zep.f(adbs.a, String.format(Locale.US, "Error parsing mac address [%s]", this.a.e), e2);
        }
        if (!this.a.h) {
            return;
        }
        adbs adbsVar = this.a;
        adbsVar.f.postDelayed(this, adbsVar.b);
    }
}
