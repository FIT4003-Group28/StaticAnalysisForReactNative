package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: xeo  reason: default package */
/* loaded from: classes7.dex */
public final class xeo {
    private final dbty<cpbq> a;

    public xeo(final Application application) {
        this.a = dbud.a(new dbty(application) { // from class: xem
            private final Application a;

            {
                this.a = application;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return cpaa.a(this.a);
            }
        });
        dbud.a(new dbty(application) { // from class: xen
            private final Application a;

            {
                this.a = application;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return couc.a(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cpbq a() {
        return this.a.a();
    }
}
