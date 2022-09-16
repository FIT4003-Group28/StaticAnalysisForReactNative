package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: lzu  reason: default package */
/* loaded from: classes3.dex */
public final class lzu {
    private final ajmy a;
    private final aafo b;
    private final acti c;
    private final wxc d;
    private final Context e;
    private final Map f = new HashMap();
    private final fjn g;
    private View h;

    public lzu(ajmy ajmyVar, aafo aafoVar, acti actiVar, wxc wxcVar, Context context, fjn fjnVar) {
        this.a = ajmyVar;
        this.b = aafoVar;
        this.c = actiVar;
        this.d = wxcVar;
        this.e = context;
        this.g = fjnVar;
    }

    private final lzt c(Object obj) {
        if (obj == null || !this.f.containsKey(obj.getClass())) {
            if (obj instanceof aqdm) {
                lzr lzrVar = new lzr(this.a, this.b, this.c, this.d, this.e);
                this.f.put(obj.getClass(), lzrVar);
                return lzrVar;
            } else if (obj instanceof augk) {
                mad madVar = new mad(this.a, this.b, this.c, this.d, this.e, this.g);
                this.f.put(obj.getClass(), madVar);
                return madVar;
            } else {
                String valueOf = String.valueOf(String.valueOf(obj));
                afus.b(1, 1, valueOf.length() != 0 ? "Unsupported companion extension renderer: ".concat(valueOf) : new String("Unsupported companion extension renderer: "));
                return null;
            }
        }
        return (lzt) this.f.get(obj.getClass());
    }

    public final void a(View view, Object obj) {
        lzt c = c(obj);
        if (view == null || c == null) {
            return;
        }
        View g = zag.g(view, R.id.companion_extension_stub, R.id.companion_extension);
        this.h = g;
        if (g == null) {
            return;
        }
        g.setVisibility(0);
        c.a(this.h, obj);
    }

    public final void b(Object obj) {
        View view = this.h;
        if (view != null) {
            view.setVisibility(8);
        }
        lzt c = c(obj);
        if (c != null) {
            c.b();
        }
    }
}
