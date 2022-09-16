package defpackage;

import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ajrp  reason: default package */
/* loaded from: classes.dex */
public final class ajrp implements View.OnClickListener {
    private static final ajrm b = new ajrk();
    private static final ajrn c = new ajrl();
    public aafo a;
    private final ajrx d;
    private final ajrm e;
    private acti f;
    private apzg g;
    private Map h;
    private ajrn i;

    public ajrp(aafo aafoVar, View view) {
        this(aafoVar, new ajsn(view));
    }

    public final void a(acti actiVar, apzg apzgVar, Map map) {
        b(actiVar, apzgVar, map, null);
    }

    public final void b(acti actiVar, apzg apzgVar, Map map, ajrn ajrnVar) {
        if (actiVar == null) {
            actiVar = acti.l;
        }
        this.f = actiVar;
        this.g = apzgVar;
        if (map == null) {
            map = Collections.emptyMap();
        }
        this.h = map;
        if (ajrnVar == null) {
            ajrnVar = c;
        }
        this.i = ajrnVar;
        this.d.b(apzgVar != null);
    }

    public final void c() {
        this.g = null;
        this.d.b(false);
        this.f = acti.l;
        this.h = Collections.emptyMap();
        this.i = c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!this.e.h(view)) {
            apzg f = this.f.f(this.g);
            this.g = f;
            aafo aafoVar = this.a;
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", this.f);
            hashMap.putAll(this.h);
            this.i.oq(hashMap);
            aafoVar.c(f, hashMap);
        }
    }

    public ajrp(aafo aafoVar, View view, ajrm ajrmVar) {
        this(aafoVar, new ajsn(view), ajrmVar);
    }

    public ajrp(aafo aafoVar, ajrx ajrxVar) {
        this(aafoVar, ajrxVar, (ajrm) null);
    }

    public ajrp(aafo aafoVar, ajrx ajrxVar, ajrm ajrmVar) {
        aafoVar.getClass();
        this.a = aafoVar;
        ajrxVar = ajrxVar == null ? new ajro() : ajrxVar;
        this.d = ajrxVar;
        ajrxVar.d(this);
        ajrxVar.b(false);
        this.e = ajrmVar == null ? b : ajrmVar;
        this.f = acti.l;
        this.i = c;
        this.h = Collections.emptyMap();
    }
}
