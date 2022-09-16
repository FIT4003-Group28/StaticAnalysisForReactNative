package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.os.Build;
import android.os.RemoteException;
import android.view.View;
import com.google.android.apps.youtube.embeddedplayer.service.model.SimplePlaybackDescriptor;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class v implements ayqb {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ v(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            int i2 = this.a;
            ax axVar = (ax) obj;
            SimplePlaybackDescriptor simplePlaybackDescriptor = axVar.q;
            if ((simplePlaybackDescriptor != null && simplePlaybackDescriptor.e == 2) || axVar.n()) {
                return;
            }
            bp bpVar = axVar.g.a;
            if (!bpVar.f()) {
                pcu.i();
                return;
            }
            try {
                bpVar.c.E(i2);
            } catch (RemoteException e) {
                pcu.h(e);
            }
        } else if (i == 1) {
            int i3 = this.a;
            int i4 = iou.cp;
            ((View) obj).setPadding(i3, 0, i3, 0);
        } else if (i == 2) {
            int i5 = this.a;
            ax axVar2 = (ax) obj;
            SimplePlaybackDescriptor simplePlaybackDescriptor2 = axVar2.q;
            if ((simplePlaybackDescriptor2 != null && simplePlaybackDescriptor2.e == 2) || axVar2.n()) {
                return;
            }
            bp bpVar2 = axVar2.g.a;
            if (!bpVar2.f()) {
                pcu.i();
                return;
            }
            try {
                bpVar2.c.F(i5);
            } catch (RemoteException e2) {
                pcu.h(e2);
            }
        } else {
            ax axVar3 = (ax) obj;
            axVar3.p = this.a;
            if (Build.VERSION.SDK_INT < 24) {
                if (axVar3.n()) {
                    return;
                }
                int i6 = axVar3.p;
                if (i6 == 8) {
                    axVar3.g.u(axVar3);
                    axVar3.g.k();
                    axVar3.e();
                } else if (i6 == 9) {
                    axVar3.g.v(axVar3, axVar3.f.e());
                } else if (i6 != 13) {
                } else {
                    axVar3.f();
                }
            } else if (axVar3.n()) {
            } else {
                int i7 = axVar3.p;
                if (i7 == 8) {
                    axVar3.g.u(axVar3);
                    axVar3.g.k();
                    axVar3.e();
                } else if (i7 == 11) {
                    axVar3.g.v(axVar3, axVar3.f.e());
                } else if (i7 != 13) {
                } else {
                    axVar3.f();
                }
            }
        }
    }
}
