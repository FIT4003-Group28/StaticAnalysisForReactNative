package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: adbh  reason: default package */
/* loaded from: classes.dex */
public final class adbh implements adwb {
    private final /* synthetic */ int a;

    public adbh() {
    }

    public adbh(int i) {
        this.a = i;
    }

    @Override // defpackage.adwb
    public final void i(yrb yrbVar) {
        if (this.a != 0) {
            return;
        }
        int i = yrbVar.a;
        if (i != 200) {
            String str = adbl.a;
            StringBuilder sb = new StringBuilder(61);
            sb.append("Error stopping YouTubeTV. Response status code is ");
            sb.append(i);
            zep.c(str, sb.toString());
        }
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            zep.j(adbl.a, "Error waiting for the TV to stop the app", e);
        }
    }

    @Override // defpackage.adwb
    public final void a(IOException iOException) {
        if (this.a == 0) {
            String str = adbl.a;
            String valueOf = String.valueOf(iOException);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("Error stopping YouTubeTV.");
            sb.append(valueOf);
            zep.c(str, sb.toString());
            return;
        }
        zep.f(acyo.a, "Terminate request failed", iOException);
    }
}
