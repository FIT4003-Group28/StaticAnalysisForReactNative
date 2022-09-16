package defpackage;

import android.view.View;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ged  reason: default package */
/* loaded from: classes3.dex */
public final class ged implements View.OnClickListener {
    private final aafo a;
    private final ajxz b;
    private final FloatingActionButton c;
    private fxz d;

    public ged(aafo aafoVar, ajxz ajxzVar, FloatingActionButton floatingActionButton) {
        this.a = aafoVar;
        this.b = ajxzVar;
        this.c = floatingActionButton;
        floatingActionButton.setOnClickListener(this);
    }

    private static Map b(Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        return hashMap;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        fxz fxzVar = this.d;
        if (fxzVar == null) {
            return;
        }
        if (fxzVar.a() != null) {
            this.a.c(this.d.a(), b(this.d));
        } else if (this.d.b() == null) {
        } else {
            this.a.c(this.d.b(), b(this.d));
        }
    }

    public final void a(fxz fxzVar) {
        if (fxzVar != null && this.d == fxzVar) {
            zag.o(this.c, true);
            return;
        }
        this.d = fxzVar;
        if (fxzVar != null) {
            arhs c = fxzVar.c();
            if (c != null) {
                ajxz ajxzVar = this.b;
                arhr b = arhr.b(c.c);
                if (b == null) {
                    b = arhr.UNKNOWN;
                }
                this.c.setImageResource(ajxzVar.a(b));
            } else {
                this.c.setImageDrawable(null);
            }
            this.c.setContentDescription(this.d.e());
            zag.o(this.c, true);
            return;
        }
        zag.o(this.c, false);
    }
}
