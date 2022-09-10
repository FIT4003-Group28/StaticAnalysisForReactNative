package defpackage;

import android.content.Context;
/* compiled from: PG */
@Deprecated
/* renamed from: cyhu  reason: default package */
/* loaded from: classes5.dex */
abstract class cyhu implements cyho {
    protected final Context a;
    private final dbty<cqvv> b = dbud.a(new dbty(this) { // from class: cyht
        private final cyhu a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            return this.a.a();
        }
    });

    /* JADX INFO: Access modifiers changed from: protected */
    public cyhu(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @dzsi
    public abstract cqvv a();

    @Override // defpackage.cyho
    public cyhn b(String str, String str2) {
        throw null;
    }

    public final cqvu c() {
        cqvv a = this.b.a();
        if (a != null) {
            try {
                return a.a();
            } catch (UnsupportedOperationException e) {
                if (String.valueOf(e.getMessage()).length() != 0) {
                    return null;
                }
                new String("Failed to create a Gcore Clearcut logger: ");
                return null;
            }
        }
        return null;
    }
}
