package defpackage;

import com.google.android.apps.gmm.directions.api.GmmNotice;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: albw  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class albw implements dbsl {
    static final dbsl a = new albw();

    private albw() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        dozw dozwVar;
        dclu<doza> dcluVar = alca.a;
        dozz c = ((GmmNotice) obj).c();
        if (c.b == 25) {
            dozwVar = (dozw) c.c;
        } else {
            dozwVar = dozw.e;
        }
        return (dozwVar.a & 4) == 0;
    }
}
