package defpackage;

import android.content.Context;
import java.io.File;
/* compiled from: PG */
/* renamed from: afff  reason: default package */
/* loaded from: classes.dex */
public final class afff extends affk {
    public static final dcqe a = dcqe.c("afff");
    public final Context b;
    @dzsi
    public File c;
    public boolean d;
    public boolean e;
    public affs f;
    @dzsi
    public File g;

    public afff(Context context, Context context2) {
        super(context);
        this.b = context2;
    }

    @Override // defpackage.affk, defpackage.afec
    public final boolean a() {
        if (this.d) {
            return false;
        }
        return super.a();
    }

    @Override // defpackage.affk, defpackage.affr
    public final boolean c() {
        return this.d;
    }

    @Override // defpackage.affk, defpackage.affr
    public final boolean d() {
        return this.e;
    }

    @Override // defpackage.affk, defpackage.affr
    public final Context e(Context context) {
        return !this.e ? context : new affc(context);
    }

    @Override // defpackage.affk, defpackage.affr
    public final String b() {
        if (this.d) {
            throw null;
        }
        return super.b();
    }
}
