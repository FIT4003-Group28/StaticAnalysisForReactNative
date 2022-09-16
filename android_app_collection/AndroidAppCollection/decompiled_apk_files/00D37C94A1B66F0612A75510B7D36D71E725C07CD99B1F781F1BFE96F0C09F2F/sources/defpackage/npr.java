package defpackage;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;
import java.util.Timer;
/* compiled from: PG */
/* renamed from: npr  reason: default package */
/* loaded from: classes3.dex */
public final class npr extends nom {
    public Timer n;
    public final Handler o;
    public final xng p;
    public List q;
    public boolean r;
    public boolean s;
    public int t;
    public boolean u;

    public npr(Context context, acti actiVar, Handler handler, xng xngVar) {
        super(context, actiVar);
        this.o = handler;
        this.s = false;
        this.r = false;
        this.p = xngVar;
    }

    @Override // defpackage.nom
    protected final void b() {
        if (this.d != null) {
            return;
        }
        this.d = (FrameLayout) LayoutInflater.from(this.a).inflate(R.layout.new_comments_button, (ViewGroup) this.e, false).findViewById(R.id.new_comments_button);
        this.f = (TextView) this.d.findViewById(R.id.new_comments_text);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: npo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                npr nprVar = npr.this;
                RecyclerView recyclerView = nprVar.c;
                if (recyclerView != null) {
                    if (((LinearLayoutManager) recyclerView.n).J() > 10) {
                        nprVar.c.al(10);
                    }
                    nprVar.c.al(0);
                    nprVar.c(false);
                    xng xngVar = nprVar.p;
                    List list = nprVar.q;
                    amzs it = xngVar.a.iterator();
                    while (it.hasNext()) {
                        ((xnf) it.next()).s(list);
                    }
                    nprVar.s = false;
                    if (!nprVar.l.h()) {
                        return;
                    }
                    nprVar.k.H(3, (acum) nprVar.l.c(), null);
                }
            }
        });
    }

    @Override // defpackage.ne
    public final void j(RecyclerView recyclerView, int i, int i2) {
        if (!this.s || !this.b || !this.u) {
            return;
        }
        if (i2 < 0) {
            if (this.m || this.r) {
                return;
            }
            d("");
        } else if (i2 <= 50 || !this.m) {
        } else {
            c(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o() {
        this.s = false;
    }
}
