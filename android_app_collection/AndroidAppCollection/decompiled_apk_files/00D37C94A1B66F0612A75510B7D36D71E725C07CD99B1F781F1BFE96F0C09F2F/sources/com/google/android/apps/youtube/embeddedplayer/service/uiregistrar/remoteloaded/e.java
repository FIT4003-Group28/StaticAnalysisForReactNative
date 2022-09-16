package com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.remoteloaded;

import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.k;
import j$.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class e {
    public boolean a;
    private final Map b = new HashMap();
    private final View.OnClickListener c;
    private final rvx d;

    public e(final rvx rvxVar, byte[] bArr) {
        this.d = rvxVar;
        this.c = new View.OnClickListener(null) { // from class: com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.remoteloaded.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rvx.this.c(view.getId());
            }
        };
    }

    public final void a(Consumer consumer) {
        for (View view : this.b.keySet()) {
            consumer.accept(view);
        }
    }

    public final void b(final View view) {
        if (view == null) {
            return;
        }
        k kVar = new k() { // from class: com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.remoteloaded.d
            @Override // com.google.android.apps.youtube.embeddedplayer.service.uiregistrar.shared.k
            public final void a(boolean z) {
                e eVar = e.this;
                View view2 = view;
                boolean z2 = false;
                if (z && !eVar.a) {
                    z2 = true;
                }
                zag.o(view2, z2);
            }
        };
        this.b.put(view, kVar);
        this.d.b(view.getId(), kVar);
        view.setOnClickListener(this.c);
    }

    public final void c(boolean z) {
        if (z == this.a) {
            return;
        }
        this.a = z;
        for (View view : this.b.keySet()) {
            boolean z2 = false;
            if (this.d.e(view.getId()) && !z) {
                z2 = true;
            }
            zag.o(view, z2);
        }
    }
}
