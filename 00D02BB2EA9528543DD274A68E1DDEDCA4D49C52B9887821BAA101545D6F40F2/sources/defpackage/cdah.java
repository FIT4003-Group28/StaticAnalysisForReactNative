package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cdah  reason: default package */
/* loaded from: classes4.dex */
public class cdah implements cdaf {
    private final cdag a;
    private final cdfj b;
    private final Context c;
    private final int d;
    private final String e;

    public cdah(cdag cdagVar, cdfj cdfjVar, Context context, int i, String str) {
        this.a = cdagVar;
        this.b = cdfjVar;
        this.c = context;
        this.d = i;
        this.e = str;
    }

    @Override // defpackage.cdaf
    public jic a() {
        return this.b.a();
    }

    @Override // defpackage.cdaf
    public CharSequence b() {
        Resources resources = this.c.getResources();
        int i = this.d;
        return resources.getQuantityString(R.plurals.TODO_PHOTO_MORE_PHOTOS, i, Integer.valueOf(i));
    }

    @Override // defpackage.cdaf
    public cqkl c() {
        this.a.a();
        return cqkl.a;
    }

    @Override // defpackage.cdaf
    public cjtd d() {
        cjta b = cjtd.b();
        b.b = this.e;
        b.d = dtxy.oQ;
        return b.a();
    }

    public boolean equals(@dzsi Object obj) {
        if (!(obj instanceof cdah)) {
            return false;
        }
        return this.b.b().equals(((cdah) obj).b.b());
    }

    public int hashCode() {
        dwfl b = this.b.b();
        int i = b.bC;
        if (i != 0) {
            return i;
        }
        int c = dsst.a.b(b).c(b);
        b.bC = c;
        return c;
    }
}
