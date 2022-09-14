package c.e.b.m;

import android.content.Context;
import c.e.b.m.c;
import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.n;
/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private d f4867a;

    private b(Context context) {
        this.f4867a = d.a(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ c a(e eVar) {
        return new b((Context) eVar.a(Context.class));
    }

    public static com.google.firebase.components.d<c> a() {
        d.b a2 = com.google.firebase.components.d.a(c.class);
        a2.a(n.b(Context.class));
        a2.a(a.a());
        return a2.b();
    }

    @Override // c.e.b.m.c
    public c.a a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean a2 = this.f4867a.a(str, currentTimeMillis);
        boolean a3 = this.f4867a.a(currentTimeMillis);
        return (!a2 || !a3) ? a3 ? c.a.GLOBAL : a2 ? c.a.SDK : c.a.NONE : c.a.COMBINED;
    }
}
