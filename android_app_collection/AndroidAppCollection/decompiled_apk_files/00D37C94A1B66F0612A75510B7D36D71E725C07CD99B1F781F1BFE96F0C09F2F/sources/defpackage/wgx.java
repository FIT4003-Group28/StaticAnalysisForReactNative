package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: wgx  reason: default package */
/* loaded from: classes4.dex */
public class wgx implements wgj, wfe, wff, wfh, wfg {
    private final Context b;
    public final View d;
    public final ajsm e;
    public wgk f;
    private final acti g;
    private final wey a = new wey();
    protected final wep c = new wep();

    public wgx(Context context, yzj yzjVar, acti actiVar, ajmy ajmyVar, ajrh ajrhVar) {
        this.b = context;
        this.g = actiVar;
        this.d = b(context);
        ajsm ajsmVar = new ajsm();
        this.e = ajsmVar;
        wfa wfaVar = new wfa(context, yzjVar, actiVar, ajmyVar.b(), this, this, this);
        wfaVar.a(aarz.class);
        ajrg a = ajrhVar.a(wfaVar.a);
        a.h(ajsmVar);
        c().setAdapter((ListAdapter) a);
    }

    @Override // defpackage.wfe
    public final void a(aarw aarwVar) {
        wgk wgkVar = this.f;
        if (wgkVar != null) {
            wgkVar.a(aarwVar);
        }
    }

    public View b(Context context) {
        ListView listView = new ListView(context);
        listView.setId(R.id.account_list);
        listView.setBackgroundColor(zhn.j(context, R.attr.ytBrandBackgroundSolid).orElse(0));
        return listView;
    }

    protected ListView c() {
        return (ListView) this.d;
    }

    protected ajsm d() {
        return this.e;
    }

    protected void e() {
        this.e.add(this.a);
    }

    protected void f() {
        this.e.add(this.c);
        this.e.add(this.a);
    }

    @Override // defpackage.wgj
    public void g(vzi vziVar) {
        Throwable th;
        aarx a;
        this.e.clear();
        d().clear();
        Context context = this.b;
        ajsm ajsmVar = this.e;
        ajsm d = d();
        aarz aarzVar = vziVar.b;
        int i = 0;
        for (aary aaryVar : aarzVar.c()) {
            if (aaryVar.a() != null) {
                i++;
            }
        }
        amuk o = amuk.o(aarzVar.c());
        aoxk a2 = aarzVar.a();
        if (a2 != null) {
            ajsmVar.add(a2);
            int size = o.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                aary aaryVar2 = (aary) o.get(i2);
                i2++;
                if (!aaryVar2.b) {
                    ajsmVar.addAll(aaryVar2.c());
                    break;
                }
            }
            aqtd b = aarzVar.b();
            if (b != null) {
                aopa mo52toBuilder = b.mo52toBuilder();
                float integer = (b.b & 4) != 0 ? b.e : context.getResources().getInteger(R.integer.account_switcher_separator_padding_dp);
                mo52toBuilder.copyOnWrite();
                aqtd aqtdVar = (aqtd) mo52toBuilder.instance;
                aqtdVar.b |= 4;
                aqtdVar.e = integer;
                ajsmVar.add(new ajre((aqtd) mo52toBuilder.mo39build()));
            }
            if (o.size() > 1) {
                ajsmVar.add(new wfi());
            }
        }
        int size2 = o.size();
        Throwable th2 = null;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < size2; i3++) {
            aary aaryVar3 = (aary) o.get(i3);
            if (i > 1 && (a = aaryVar3.a()) != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(a.b);
            } else if (aaryVar3.b) {
                ajsmVar.addAll(aaryVar3.c());
            }
        }
        d.addAll(aarzVar.d());
        if (i > 1) {
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                if (it.hasNext() && (th = (Throwable) it.next()) != null) {
                    Class<?> cls = th.getClass();
                    while (true) {
                        if (it.hasNext()) {
                            if (!cls.equals(((Throwable) it.next()).getClass())) {
                                break;
                            }
                        } else {
                            th2 = th;
                            break;
                        }
                    }
                }
            }
            ajsmVar.add(aarx.a(th2));
        }
        e();
        for (aase aaseVar : vziVar.a) {
            ((acsx) this.g).D(new acte(aaseVar.a.e.I()));
        }
    }

    @Override // defpackage.wff
    public final void i(aarx aarxVar) {
        wgk wgkVar = this.f;
        if (wgkVar != null) {
            Intent intent = aarxVar.a;
            if (intent != null) {
                ((wgv) wgkVar).b.startActivity(intent);
            } else {
                ((wgv) wgkVar).c();
            }
        }
    }

    @Override // defpackage.wfg
    public final void j() {
        wgk wgkVar = this.f;
        if (wgkVar != null) {
            ((wgv) wgkVar).b();
        }
    }

    @Override // defpackage.wfh
    public final void k() {
        wgk wgkVar = this.f;
        if (wgkVar != null) {
            wgv wgvVar = (wgv) wgkVar;
            wgvVar.c.j(wgvVar.b, wgvVar.d);
        }
    }

    @Override // defpackage.wgj
    public final void l(String str) {
        zag.r(this.b, str, 1);
    }

    @Override // defpackage.wgj
    public final void m() {
        this.e.clear();
        d().clear();
        f();
    }
}
