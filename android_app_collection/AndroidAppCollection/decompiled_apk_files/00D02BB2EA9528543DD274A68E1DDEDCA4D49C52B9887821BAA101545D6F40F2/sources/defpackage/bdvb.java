package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bdvb  reason: default package */
/* loaded from: classes3.dex */
public final class bdvb implements View.OnAttachStateChangeListener {
    final /* synthetic */ bdvc a;

    public bdvb(bdvc bdvcVar) {
        this.a = bdvcVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (view instanceof bxbx) {
            final bxbx bxbxVar = (bxbx) view;
            if (!bxbxVar.a()) {
                bdvc bdvcVar = this.a;
                bxbxVar.g(bdvcVar.d, bdvcVar.e, bdvcVar.f);
                bxbxVar.d();
            }
            final long currentTimeMillis = System.currentTimeMillis();
            bxbxVar.b(this.a.a, new Runnable(this, currentTimeMillis, bxbxVar) { // from class: bdva
                private final bdvb a;
                private final long b;
                private final bxbx c;

                {
                    this.a = this;
                    this.b = currentTimeMillis;
                    this.c = bxbxVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bdvb bdvbVar = this.a;
                    long j = this.b;
                    this.c.e(Math.max(100, Math.min(bdvbVar.a.c.getResources().getInteger(17694720), ((int) (System.currentTimeMillis() - j)) / 2)));
                }
            });
            this.a.i = bxbxVar.f();
            bdvc bdvcVar2 = this.a;
            bwuj bwujVar = bdvcVar2.i;
            if (bwujVar == null) {
                return;
            }
            bwujVar.b(bdvcVar2.b);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (view instanceof bxbx) {
            this.a.i = null;
            bxbx bxbxVar = (bxbx) view;
            bxbxVar.setTag(R.id.photo_gallery_swipeable_item, null);
            bxbxVar.d();
            bxbxVar.c();
        }
    }
}
