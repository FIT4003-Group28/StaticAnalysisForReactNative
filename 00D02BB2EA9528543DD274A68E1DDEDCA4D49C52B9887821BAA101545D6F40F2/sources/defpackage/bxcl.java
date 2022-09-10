package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gmm.streetview.model.PanoramaLevel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: bxcl  reason: default package */
/* loaded from: classes4.dex */
public class bxcl implements izc {
    @dzsi
    izb b;
    private final Context c;
    private final bxci d;
    @dzsi
    private bxcj f;
    private final List<iza> e = new ArrayList();
    public List<PanoramaLevel> a = new ArrayList();

    public bxcl(Context context, bxci bxciVar, @dzsi izb izbVar) {
        this.c = context;
        this.d = bxciVar;
        this.b = izbVar;
    }

    private final void f(int i, int i2, int i3) {
        this.e.clear();
        while (i < i2) {
            PanoramaLevel panoramaLevel = this.a.get(i);
            boolean z = i == i3;
            bxcj bxcjVar = new bxcj(this.c, panoramaLevel, z, this.d);
            this.e.add(bxcjVar);
            if (z) {
                this.f = bxcjVar;
            }
            i++;
        }
    }

    @Override // defpackage.izc
    public Boolean a() {
        boolean z = true;
        if (this.a.size() <= 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.izc
    public List<iza> b() {
        return this.e;
    }

    @Override // defpackage.izc
    public Boolean c() {
        boolean z = false;
        if (a().booleanValue() && this.a.size() != this.e.size()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.izc
    public View.OnClickListener d() {
        return new View.OnClickListener(this) { // from class: bxck
            private final bxcl a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bxcl bxclVar = this.a;
                int e = bxclVar.e(bxclVar.a, null, true);
                cqkx.p(bxclVar);
                izb izbVar = bxclVar.b;
                if (izbVar != null) {
                    izbVar.a(e);
                }
            }
        };
    }

    public int e(List<PanoramaLevel> list, @dzsi PanoramaLevel panoramaLevel, boolean z) {
        int size;
        int size2;
        bxcj bxcjVar;
        ArrayList arrayList = new ArrayList(list);
        this.a = arrayList;
        Collections.sort(arrayList, new bwzn());
        if (panoramaLevel == null && (bxcjVar = this.f) != null) {
            panoramaLevel = bxcjVar.j();
        }
        int indexOf = this.a.indexOf(panoramaLevel);
        if (z || this.a.size() <= 5) {
            f(0, this.a.size(), indexOf);
        } else {
            if (indexOf != -1) {
                size = Math.max(0, indexOf - 2);
                int i = size + 4;
                size2 = Math.min(i, this.a.size());
                if (i > this.a.size()) {
                    size = size2 - 4;
                }
            } else {
                size = this.a.size() - 4;
                size2 = this.a.size();
            }
            f(size, size2, indexOf);
        }
        cqkx.p(this);
        return indexOf;
    }
}
