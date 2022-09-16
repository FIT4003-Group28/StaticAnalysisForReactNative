package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ejf  reason: default package */
/* loaded from: classes3.dex */
public final class ejf implements eis {
    public final dt a;
    public final yzj b;
    public final aauj c;
    public final Handler d;
    public final Executor e;
    public final Executor f;
    public EditText h;
    public AlertDialog i;
    public aptv j;
    public TextWatcher k;
    public aajl l;
    private final afvn o;
    private final aagi p;
    private final ajgf q;
    private final azqb r;
    private View s;
    private TextInputLayout t;
    private LinearLayout u;
    private Drawable v;
    private aypg w;
    public final zhd g = zhd.a(fxm.b);
    public Runnable m = null;
    public ankt n = null;

    public ejf(dt dtVar, yzj yzjVar, afvn afvnVar, aagi aagiVar, ajve ajveVar, azqb azqbVar, aauj aaujVar, Handler handler, Executor executor, Executor executor2) {
        this.a = dtVar;
        this.b = yzjVar;
        this.o = afvnVar;
        this.p = aagiVar;
        this.q = ajveVar;
        this.r = azqbVar;
        this.c = aaujVar;
        this.d = handler;
        this.e = executor;
        this.f = executor2;
    }

    private final void g() {
        this.t.v(null);
    }

    @Override // defpackage.eis
    public final void a(aptv aptvVar) {
        if (this.i == null) {
            this.k = new eiz(this);
            this.l = this.p.a(this.o.c());
            View inflate = LayoutInflater.from(this.a).inflate(R.layout.channel_profile_handle_editor, (ViewGroup) null);
            this.s = inflate;
            TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.handle_edit_layout);
            this.t = textInputLayout;
            textInputLayout.J("@");
            TextView textView = (TextView) this.t.findViewById(R.id.textinput_prefix_text);
            textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
            textView.setGravity(17);
            this.t.q(-1);
            this.v = new tpj(this.a.getResources().getDimension(R.dimen.channel_edit_handle_progress_radius), this.a.getResources().getDimensionPixelSize(R.dimen.channel_edit_handle_progress_stroke_width), 0, new int[]{zhn.d(this.a, R.attr.ytIconActiveOther)});
            this.t.w(true);
            this.t.y(ColorStateList.valueOf(zhn.d(this.a, R.attr.ytErrorIndicator)));
            this.h = (EditText) this.t.findViewById(R.id.handle_edit);
            this.u = (LinearLayout) this.s.findViewById(R.id.info_items_layout);
            AlertDialog create = new AlertDialog.Builder(this.a).setView(this.s).setPositiveButton(this.a.getString(17039370), (DialogInterface.OnClickListener) null).setNegativeButton(this.a.getString(17039360), (DialogInterface.OnClickListener) null).create();
            this.i = create;
            create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: eiu
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    final ejf ejfVar = ejf.this;
                    ejfVar.h.addTextChangedListener(ejfVar.k);
                    ejfVar.i.getButton(-1).setOnClickListener(new View.OnClickListener() { // from class: eiv
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            final ejf ejfVar2 = ejf.this;
                            final String obj = ejfVar2.h.getText().toString();
                            if (obj.equals(ejfVar2.j.c)) {
                                ejfVar2.i.dismiss();
                                return;
                            }
                            aauj aaujVar = ejfVar2.c;
                            String str = ejfVar2.j.e;
                            aauc aaucVar = new aauc(aaujVar.e, aaujVar.a);
                            ((aaue) aaucVar).c = str;
                            aaucVar.a = obj;
                            ylx.n(ejfVar2.a, ejfVar2.c.a(aaucVar), new zdt() { // from class: eiw
                                @Override // defpackage.zdt
                                public final void a(Object obj2) {
                                    ejf ejfVar3 = ejf.this;
                                    Throwable th = (Throwable) obj2;
                                    ejfVar3.b.d(ejfVar3.j.h);
                                }
                            }, new zdt() { // from class: eix
                                @Override // defpackage.zdt
                                public final void a(Object obj2) {
                                    ejf ejfVar3 = ejf.this;
                                    asen asenVar = (asen) obj2;
                                    ejfVar3.g.b(obj);
                                    ejfVar3.i.dismiss();
                                }
                            });
                        }
                    });
                    ejfVar.h.selectAll();
                    zag.p(ejfVar.h);
                }
            });
            this.i.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: eit
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    ejf ejfVar = ejf.this;
                    ejfVar.e();
                    ejfVar.h.removeTextChangedListener(ejfVar.k);
                    ejfVar.d();
                }
            });
        }
        e();
        this.j = aptvVar;
        TextInputLayout textInputLayout2 = this.t;
        arag aragVar = aptvVar.d;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        textInputLayout2.B(ajgl.b(aragVar));
        this.h.setText(this.j.c);
        this.t.p(null);
        g();
        this.u.removeAllViews();
        for (aptx aptxVar : this.j.j) {
            eme emeVar = (eme) this.r.get();
            new ajrs();
            emeVar.d(aptxVar);
            this.u.addView(emeVar.a);
        }
        if (this.j.j.size() > 0) {
            this.u.setVisibility(0);
        } else {
            this.u.setVisibility(8);
        }
        this.w = this.l.i(this.j.f).X(aypa.a()).as(new ayqb() { // from class: eiy
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                ejf ejfVar = ejf.this;
                ampq ampqVar = (ampq) obj;
                if (!ampqVar.h() || !(ampqVar.c() instanceof apse)) {
                    return;
                }
                apse apseVar = (apse) ampqVar.c();
                if ((apseVar.b.b & 2) == 0) {
                    return;
                }
                String handleEdit = apseVar.getHandleEdit();
                ejfVar.h.setText(handleEdit);
                ejfVar.h.setSelection(handleEdit.length());
                String d = apseVar.d();
                d.getClass();
                aqxo.z(!d.isEmpty(), "key cannot be empty");
                aopa createBuilder = apsf.a.createBuilder();
                createBuilder.copyOnWrite();
                apsf apsfVar = (apsf) createBuilder.instance;
                apsfVar.b |= 1;
                apsfVar.c = d;
                byte[] c = new apsc(createBuilder).b().c();
                aopa createBuilder2 = aqvy.a.createBuilder();
                alzh b = alzi.b();
                b.d(2);
                alzl b2 = b.b();
                createBuilder2.copyOnWrite();
                aqvy aqvyVar = (aqvy) createBuilder2.instance;
                b2.getClass();
                aqvyVar.d = b2;
                aqvyVar.b = 2 | aqvyVar.b;
                aajs c2 = ejfVar.l.c();
                c2.i(apseVar.d(), (aqvy) createBuilder2.mo39build(), c);
                c2.b().Q();
            }
        });
        this.i.show();
        Window window = this.i.getWindow();
        if (window != null) {
            window.setLayout((int) this.a.getResources().getDimension(R.dimen.channel_edit_dialog_width), -2);
        }
    }

    @Override // defpackage.eis
    public final void b(ekc ekcVar) {
        this.g.c(ekcVar);
    }

    @Override // defpackage.eis
    public final void c(ekc ekcVar) {
        this.g.d(ekcVar);
    }

    public final void d() {
        Runnable runnable = this.m;
        if (runnable != null) {
            this.d.removeCallbacks(runnable);
            this.m = null;
        }
        ankt anktVar = this.n;
        if (anktVar != null) {
            anktVar.cancel(true);
            this.n = null;
        }
    }

    public final void e() {
        aypg aypgVar = this.w;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
            this.w = null;
        }
    }

    public final void f(eje ejeVar) {
        int i = ejeVar.b - 1;
        if (i != 0) {
            if (i == 1) {
                this.t.p(null);
                g();
                this.i.getButton(-1).setEnabled(false);
                return;
            } else if (i == 2) {
                this.t.p(this.v);
                g();
                this.i.getButton(-1).setEnabled(false);
                return;
            } else if (i != 3) {
                this.t.p(null);
                Spanned c = ajgl.c(ejeVar.a, this.q);
                ((TextView) this.t.findViewById(R.id.textinput_error)).setMovementMethod(LinkMovementMethod.getInstance());
                this.t.v(c);
                this.i.getButton(-1).setEnabled(false);
                return;
            }
        }
        this.t.p(null);
        g();
        this.i.getButton(-1).setEnabled(true);
    }
}
