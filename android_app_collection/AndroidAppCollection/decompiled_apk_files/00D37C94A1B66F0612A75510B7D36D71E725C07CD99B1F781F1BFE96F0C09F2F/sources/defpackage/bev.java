package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: bev  reason: default package */
/* loaded from: classes2.dex */
public class bev extends ov {
    private final bhd a;
    private final bet b;
    private TextView c;
    private bgo d;
    private ArrayList e;
    private beu f;
    private ListView g;
    private boolean h;
    private long i;
    private final Handler j;

    public bev(Context context) {
        this(context, null);
    }

    public void a(List list) {
        int size = list.size();
        while (true) {
            int i = size - 1;
            if (size > 0) {
                if (!i((bhc) list.get(i))) {
                    list.remove(i);
                }
                size = i;
            } else {
                return;
            }
        }
    }

    public final void b() {
        if (this.h) {
            ArrayList arrayList = new ArrayList(bhd.i());
            a(arrayList);
            Collections.sort(arrayList, wd.a);
            if (SystemClock.uptimeMillis() - this.i >= 300) {
                h(arrayList);
                return;
            }
            this.j.removeMessages(1);
            Handler handler = this.j;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.i + 300);
        }
    }

    public final void f(bgo bgoVar) {
        if (bgoVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.d.equals(bgoVar)) {
            return;
        }
        this.d = bgoVar;
        if (this.h) {
            this.a.r(this.b);
            this.a.q(bgoVar, this.b, 1);
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        getWindow().setLayout(ks.b(getContext()), -2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(List list) {
        this.i = SystemClock.uptimeMillis();
        this.e.clear();
        this.e.addAll(list);
        this.f.notifyDataSetChanged();
    }

    public final boolean i(bhc bhcVar) {
        return !bhcVar.j() && bhcVar.g && bhcVar.n(this.d);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h = true;
        this.a.q(this.d, this.b, 1);
        b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ov, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_chooser_dialog);
        this.e = new ArrayList();
        this.f = new beu(getContext(), this.e);
        ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
        this.g = listView;
        listView.setAdapter((ListAdapter) this.f);
        this.g.setOnItemClickListener(this.f);
        this.g.setEmptyView(findViewById(16908292));
        this.c = (TextView) findViewById(R.id.mr_chooser_title);
        g();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.h = false;
        this.a.r(this.b);
        this.j.removeMessages(1);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.ov, android.app.Dialog
    public final void setTitle(int i) {
        this.c.setText(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bev(android.content.Context r1, byte[] r2) {
        /*
            r0 = this;
            r2 = 0
            android.content.Context r1 = defpackage.kt.H(r1, r2, r2)
            int r2 = defpackage.kt.C(r1)
            r0.<init>(r1, r2)
            bgo r1 = defpackage.bgo.a
            r0.d = r1
            bes r1 = new bes
            r1.<init>(r0)
            r0.j = r1
            android.content.Context r1 = r0.getContext()
            bhd r1 = defpackage.bhd.b(r1)
            r0.a = r1
            bet r1 = new bet
            r1.<init>(r0)
            r0.b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bev.<init>(android.content.Context, byte[]):void");
    }

    @Override // defpackage.ov, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
