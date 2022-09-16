package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import j$.util.Collection;
/* compiled from: PG */
/* renamed from: nee  reason: default package */
/* loaded from: classes3.dex */
public final class nee implements ajru, ynl {
    public aucd a;
    private final yni b;
    private final ajxz c;
    private final View d;
    private final TextView e;
    private final ImageView f;
    private final CheckBox g;
    private final ImageView h;
    private final nie i;

    public nee(Activity activity, final aafo aafoVar, yni yniVar, ajxz ajxzVar, final nie nieVar, ViewGroup viewGroup) {
        this.b = yniVar;
        this.i = nieVar;
        this.c = ajxzVar;
        View inflate = activity.getLayoutInflater().inflate(R.layout.playlist_add_to_entry, viewGroup, false);
        this.d = inflate;
        inflate.setOnClickListener(new View.OnClickListener() { // from class: ned
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nee neeVar = nee.this;
                aafo aafoVar2 = aafoVar;
                nie nieVar2 = nieVar;
                int ch = awwc.ch(neeVar.a.e);
                if (ch == 0) {
                    ch = 1;
                }
                int i = ch - 1;
                if (i == 0) {
                    apzg apzgVar = neeVar.a.g;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar2.c(apzgVar, null);
                    nieVar2.b.b.aK(true);
                } else if (i == 3) {
                    apzg apzgVar2 = neeVar.a.h;
                    if (apzgVar2 == null) {
                        apzgVar2 = apzg.a;
                    }
                    aafoVar2.c(apzgVar2, null);
                    neeVar.d(4, neeVar.a.c);
                } else {
                    apzg apzgVar3 = neeVar.a.g;
                    if (apzgVar3 == null) {
                        apzgVar3 = apzg.a;
                    }
                    aafoVar2.c(apzgVar3, null);
                    neeVar.d(2, neeVar.a.c);
                }
            }
        });
        this.e = (TextView) inflate.findViewById(R.id.title);
        this.f = (ImageView) inflate.findViewById(R.id.icon);
        this.g = (CheckBox) inflate.findViewById(R.id.checkbox);
        this.h = (ImageView) inflate.findViewById(R.id.privacy_status);
    }

    private final void e() {
        CheckBox checkBox = this.g;
        int ch = awwc.ch(this.a.e);
        boolean z = false;
        if (ch != 0 && ch == 4) {
            z = true;
        }
        checkBox.setChecked(z);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        int i2 = 1;
        if (i != -1) {
            if (i == 0) {
                abbj abbjVar = (abbj) obj;
                if (!this.a.c.equals(abbjVar.a)) {
                    return null;
                }
                int ch = awwc.ch(this.a.e);
                if (ch != 0) {
                    i2 = ch;
                }
                d(i2, abbjVar.a);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{abbj.class};
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        aucd aucdVar = (aucd) obj;
        this.b.m(this);
        this.b.g(this);
        this.a = aucdVar;
        TextView textView = this.e;
        arag aragVar2 = null;
        if ((aucdVar.b & 2) != 0) {
            aragVar = aucdVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = this.e;
        if ((aucdVar.b & 2) != 0 && (aragVar2 = aucdVar.d) == null) {
            aragVar2 = arag.a;
        }
        textView2.setContentDescription(ajgl.i(aragVar2));
        int ch = awwc.ch(aucdVar.e);
        if (ch == 0 || ch == 1) {
            this.g.setVisibility(8);
            this.h.setVisibility(8);
            this.f.setVisibility(0);
            if (aucdVar.c.equals("WL")) {
                this.f.setImageResource(2131231416);
                return;
            } else {
                this.f.setImageResource(2131232681);
                return;
            }
        }
        this.f.setVisibility(8);
        this.g.setVisibility(0);
        ajxz ajxzVar = this.c;
        arhs arhsVar = this.a.f;
        if (arhsVar == null) {
            arhsVar = arhs.a;
        }
        arhr b = arhr.b(arhsVar.c);
        if (b == null) {
            b = arhr.UNKNOWN;
        }
        int a = ajxzVar.a(b);
        if (a != 0) {
            this.h.setImageResource(a);
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(8);
        }
        e();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.b.m(this);
    }

    public final void d(int i, String str) {
        int i2 = i - 1;
        if (i2 == 1) {
            aopc aopcVar = (aopc) this.a.mo52toBuilder();
            aopcVar.copyOnWrite();
            aucd aucdVar = (aucd) aopcVar.instance;
            aucdVar.e = 3;
            aucdVar.b |= 16;
            this.a = (aucd) aopcVar.mo39build();
            this.i.b.d(str, 4);
        } else if (i2 == 3) {
            aopc aopcVar2 = (aopc) this.a.mo52toBuilder();
            aopcVar2.copyOnWrite();
            aucd aucdVar2 = (aucd) aopcVar2.instance;
            aucdVar2.e = 1;
            aucdVar2.b |= 16;
            this.a = (aucd) aopcVar2.mo39build();
            nie nieVar = this.i;
            nieVar.b.d(str, 2);
            if (Collection.EL.stream(nieVar.b.e).filter(lws.o).map(meg.l).allMatch(lws.n)) {
                String f = aakj.f(231, nieVar.b.c);
                aagh c = nieVar.b.d.c();
                c.f(f).G(ayoc.v(auof.f(f).c())).g(auog.class).c(new gna(c, 5)).Q();
                nieVar.a.d(new kqf(nieVar.b.c));
            }
        }
        e();
    }
}
