package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: axsc  reason: default package */
/* loaded from: classes3.dex */
public final class axsc extends itb {
    public final axxl a;

    public axsc(Object obj, Context context, dxio<akty> dxioVar, dxio<akvz> dxioVar2, btrm btrmVar, alwc alwcVar, dehq dehqVar, akpq akpqVar, akzh akzhVar, alvc alvcVar, ania aniaVar, final dzsj<dwwr> dzsjVar) {
        this.a = new axxl(obj, context, dxioVar, dxioVar2, btrmVar, alwcVar, dehqVar, akpqVar, akzhVar, alvcVar, aniaVar, dbud.a(new dbty(dzsjVar) { // from class: axsb
            private final dzsj a;

            {
                this.a = dzsjVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Boolean.valueOf(((dwwr) this.a.a()).C);
            }
        }));
    }

    @Override // defpackage.itb
    public final void Nu() {
        this.a.a(false);
        super.Nu();
    }

    public final void e(boolean z) {
        this.a.a(z);
    }
}
