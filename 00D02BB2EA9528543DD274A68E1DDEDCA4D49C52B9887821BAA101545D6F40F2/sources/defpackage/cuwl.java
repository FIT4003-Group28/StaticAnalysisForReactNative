package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import defpackage.acl;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/* compiled from: PG */
/* renamed from: cuwl  reason: default package */
/* loaded from: classes5.dex */
public abstract class cuwl<ModelT, HolderT extends acl> extends tj<ModelT, cuwk<HolderT>> {
    public static final int e = new Random().nextInt();
    public Drawable f;
    private boolean g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cuwl(defpackage.tt<ModelT> r3) {
        /*
            r2 = this;
            tb r0 = new tb
            cuwj r1 = new cuwj
            r1.<init>(r3)
            r0.<init>(r1)
            cstj r3 = defpackage.cstj.b()
            dehp r3 = r3.a
            java.util.concurrent.Executor r3 = defpackage.dehx.b(r3)
            r0.a = r3
            tc r3 = r0.a()
            r2.<init>(r3)
            r3 = 0
            r2.f = r3
            r3 = 1
            r2.g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuwl.<init>(tt):void");
    }

    protected int A(int i) {
        throw null;
    }

    public final synchronized void B() {
        this.g = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tj
    public void a(List<ModelT> list) {
        List list2;
        if (list == null || list.isEmpty()) {
            super.a(null);
            return;
        }
        synchronized (this) {
            list2 = list;
            if (this.g) {
                List arrayList = new ArrayList(list);
                arrayList.add(null);
                list2 = (List<ModelT>) arrayList;
            }
        }
        super.a(list2);
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ acl d(ViewGroup viewGroup, int i) {
        if (i == e) {
            ImageView imageView = new ImageView(viewGroup.getContext());
            Drawable drawable = this.f;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            }
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            od.m(imageView, 2);
            LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.addView(imageView);
            int a = cuwg.a(viewGroup.getContext(), 10.0f);
            linearLayout.setPadding(a, a, a, a);
            linearLayout.setLayoutParams(new abt(-1, -2));
            return new cuwk(linearLayout);
        }
        return new cuwk(y(viewGroup, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ void e(acl aclVar, int i) {
        cuwk cuwkVar = (cuwk) aclVar;
        if (cuwkVar.s == 0 || b(i) == null) {
            return;
        }
        View view = cuwkVar.s.a;
        if (view instanceof cuww) {
            ((cuww) view).b();
        }
        z(cuwkVar.s, i);
    }

    @Override // defpackage.abg
    public final int i(int i) {
        return b(i) == null ? e : A(i);
    }

    protected abstract HolderT y(ViewGroup viewGroup, int i);

    protected abstract void z(HolderT holdert, int i);
}
