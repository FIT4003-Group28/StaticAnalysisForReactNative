package defpackage;

import com.spotify.protocol.types.UserStatus;
/* compiled from: PG */
/* renamed from: dxez  reason: default package */
/* loaded from: classes6.dex */
public final class dxez implements dxhf<UserStatus> {
    final /* synthetic */ dxfd a;
    final /* synthetic */ dxfb b;

    public dxez(dxfb dxfbVar, dxfd dxfdVar) {
        this.b = dxfbVar;
        this.a = dxfdVar;
    }

    @Override // defpackage.dxhf
    public final /* bridge */ /* synthetic */ void a(UserStatus userStatus) {
        UserStatus userStatus2 = userStatus;
        userStatus2.isLoggedIn();
        dxgt.a();
        if (!userStatus2.isLoggedIn()) {
            this.b.b.a(new dxfg());
            return;
        }
        arvu arvuVar = this.b.b;
        dxfd dxfdVar = this.a;
        synchronized (arvuVar.b) {
            arvuVar.b.b = dxfdVar;
        }
        ckcw ckcwVar = arvuVar.b.a;
        ckgz ckgzVar = ckhi.aJ;
        dbsk.s(ckgzVar);
        ((ckco) ckcwVar.a(ckgzVar)).a(-1);
        arvuVar.a.a(dxfdVar);
    }
}
