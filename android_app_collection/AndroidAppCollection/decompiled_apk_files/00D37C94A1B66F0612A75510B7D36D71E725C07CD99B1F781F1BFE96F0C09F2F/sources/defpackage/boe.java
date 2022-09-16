package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: boe  reason: default package */
/* loaded from: classes2.dex */
final class boe extends bnl {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ View c;
    final /* synthetic */ boh d;

    public boe(boh bohVar, ViewGroup viewGroup, View view, View view2) {
        this.d = bohVar;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    @Override // defpackage.bnl, defpackage.bnj
    public final void a(bnk bnkVar) {
        this.c.setTag(R.id.save_overlay_view, null);
        this.a.getOverlay().remove(this.b);
        bnkVar.B(this);
    }

    @Override // defpackage.bnl, defpackage.bnj
    public final void c() {
        this.a.getOverlay().remove(this.b);
    }

    @Override // defpackage.bnl, defpackage.bnj
    public final void d() {
        if (this.b.getParent() == null) {
            this.a.getOverlay().add(this.b);
            return;
        }
        boh bohVar = this.d;
        int size = bohVar.l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ((Animator) bohVar.l.get(size)).cancel();
        }
        ArrayList arrayList = bohVar.m;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) bohVar.m.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((bnj) arrayList2.get(i)).b();
        }
    }
}
