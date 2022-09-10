package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajxt  reason: default package */
/* loaded from: classes2.dex */
public final class ajxt implements cxsf {
    final /* synthetic */ ajya a;

    public ajxt(ajya ajyaVar) {
        this.a = ajyaVar;
    }

    @Override // defpackage.cxsf
    public final void a(String[] strArr) {
        ajxx ajxxVar = this.a.i;
        if (ajxxVar != null) {
            ajxxVar.a(strArr, new ajxy(this) { // from class: ajxs
                private final ajxt a;

                {
                    this.a = this;
                }

                @Override // defpackage.ajxy
                public final void a(int i, String[] strArr2, int[] iArr) {
                    cxti cxtiVar;
                    cxsx cxsxVar = this.a.a.b;
                    if (cxsxVar == null || (cxtiVar = cxsxVar.c) == null) {
                        return;
                    }
                    cxtiVar.k(i, iArr);
                }
            });
        }
    }

    @Override // defpackage.cxsf
    public final boolean b() {
        dbsl<String> dbslVar = this.a.h;
        if (dbslVar != null) {
            return dbslVar.a("android.permission.READ_CONTACTS");
        }
        return false;
    }
}
