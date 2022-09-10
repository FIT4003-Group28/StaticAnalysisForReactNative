package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: cdap  reason: default package */
/* loaded from: classes4.dex */
public class cdap implements cdan {
    private final cdao a;
    private final cdbf b;
    private final Context c;
    private final int d;

    public cdap(int i, cdbf cdbfVar, cdao cdaoVar, Context context) {
        this.d = i;
        this.b = cdbfVar;
        this.a = cdaoVar;
        this.c = context;
    }

    private final dcep<String> f() {
        cdbf cdbfVar = this.b;
        dcep K = dcep.K(cdbfVar.e.f(Integer.valueOf(this.d)));
        final HashSet<String> hashSet = cdbfVar.c;
        hashSet.getClass();
        return dcep.K(dcnm.q(K, new dbsl(hashSet) { // from class: cdbe
            private final HashSet a;

            {
                this.a = hashSet;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return this.a.contains((String) obj);
            }
        }));
    }

    @Override // defpackage.cdan
    public CharSequence a() {
        int size = f().size();
        if (size == 0) {
            return this.c.getResources().getString(R.string.TODO_PHOTO_PLACE_CARD_POST_ZERO_PHOTOS);
        }
        return this.c.getResources().getQuantityString(R.plurals.TODO_PHOTO_PLACE_CARD_POST_N_PHOTOS, size, Integer.valueOf(size)).trim();
    }

    @Override // defpackage.cdan
    public cqkl b(cjqm cjqmVar) {
        bvrj.UI_THREAD.c();
        this.a.b(cjqmVar, f());
        return cqkl.a;
    }

    @Override // defpackage.cdan
    public Boolean c() {
        return Boolean.valueOf(!f().isEmpty());
    }

    @Override // defpackage.cdan
    public cjtd d() {
        cjta b = cjtd.b();
        b.d = dtxy.oN;
        b.g(this.b.a(this.d));
        b.b = this.b.a;
        return b.a();
    }

    @Override // defpackage.cdan
    public String e() {
        int size = f().size();
        String n = this.b.d(this.d).n();
        if (size == 0) {
            return this.c.getString(R.string.TODO_PHOTO_ACCESSIBILITY_PLACE_CARD_POST_ZERO_PHOTOS, n);
        }
        return this.c.getResources().getQuantityString(R.plurals.TODO_PHOTO_ACCESSIBILITY_PLACE_CARD_POST_N_PHOTOS_FOR_PLACE, size, Integer.valueOf(size), n).trim();
    }
}
