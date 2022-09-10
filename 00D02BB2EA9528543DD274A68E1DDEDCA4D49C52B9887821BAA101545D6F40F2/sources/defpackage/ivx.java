package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: ivx  reason: default package */
/* loaded from: classes6.dex */
public class ivx implements iza {
    public final altu a;
    private final Context e;
    private final ivy f;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    private final cjtd g = cjtd.a(dtyi.K);

    public ivx(Context context, altu altuVar, ivy ivyVar) {
        this.e = context;
        this.a = altuVar;
        this.f = ivyVar;
    }

    @Override // defpackage.iza
    public Boolean a() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.iza
    public cqkl b() {
        if (!this.b) {
            ivy ivyVar = this.f;
            akqh b = this.a.b();
            if (ivyVar.g(b) && ivyVar.a != null) {
                if (altu.a.equals(b)) {
                    ivyVar.b.d(ivyVar.a.a);
                } else {
                    ivyVar.b.c(b);
                }
                ivyVar.c.a().m().h(amwd.OFF);
            }
            this.b = true;
        }
        return cqkl.a;
    }

    @Override // defpackage.iza
    public CharSequence c() {
        return this.a.c;
    }

    @Override // defpackage.iza
    public Boolean d() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.iza
    public Boolean e() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.iza
    public cjtd f() {
        return this.g;
    }

    @Override // defpackage.iza
    public CharSequence g() {
        String lowerCase = c().toString().toLowerCase(Locale.getDefault());
        if (this.c) {
            if (!this.d) {
                return this.e.getString(R.string.ACCESSIBILITY_FLOOR_WITH_RESULT, lowerCase);
            }
            return this.e.getString(R.string.ACCESSIBILITY_FLOOR_WITH_RESULT_AND_LOCATION, lowerCase);
        } else if (this.d) {
            return this.e.getString(R.string.ACCESSIBILITY_FLOOR_WITH_LOCATION, lowerCase);
        } else {
            return this.e.getString(R.string.ACCESSIBILITY_FLOOR, lowerCase);
        }
    }
}
