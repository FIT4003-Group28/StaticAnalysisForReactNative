package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cwgt  reason: default package */
/* loaded from: classes5.dex */
public final class cwgt implements cwii {
    final /* synthetic */ cwql a;

    public cwgt(cwql cwqlVar) {
        this.a = cwqlVar;
    }

    @Override // defpackage.cwii
    public final Runnable a() {
        final cwql cwqlVar = this.a;
        cwqlVar.getClass();
        return new Runnable(cwqlVar) { // from class: cwgr
            private final cwql a;

            {
                this.a = cwqlVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cwql cwqlVar2 = this.a;
                czhz.b();
                ExpandableDialogView expandableDialogView = cwqlVar2.ah;
                if (expandableDialogView != null) {
                    View findViewById = expandableDialogView.findViewById(R.id.og_container_disable_content_view);
                    findViewById.setVisibility(0);
                    findViewById.setOnClickListener(cwpu.a);
                }
            }
        };
    }

    @Override // defpackage.cwii
    public final Runnable b() {
        final cwql cwqlVar = this.a;
        cwqlVar.getClass();
        return new Runnable(cwqlVar) { // from class: cwgs
            private final cwql a;

            {
                this.a = cwqlVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.f();
            }
        };
    }
}
