package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.activity.ShortsCreationActivity;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: gve  reason: default package */
/* loaded from: classes3.dex */
public final class gve extends gvf implements her {
    public hes a;
    public boolean b = false;
    public final ShortsCreationActivity c;
    public final hkg d;
    public final snc e;
    public final hkl f;
    private apzg h;

    public gve(ShortsCreationActivity shortsCreationActivity, hkg hkgVar, snc sncVar, hkl hklVar) {
        this.c = shortsCreationActivity;
        this.d = hkgVar;
        this.e = sncVar;
        this.f = hklVar;
    }

    public final void a(long j) {
        Intent intent;
        byte[] byteArrayExtra;
        dp e = this.c.getSupportFragmentManager().e(R.id.reel_creation_container);
        if (!(e instanceof hes)) {
            if (this.h == null && (intent = this.c.getIntent()) != null && (byteArrayExtra = intent.getByteArrayExtra("navigation_endpoint")) != null) {
                try {
                    this.h = (apzg) aopi.parseFrom(apzg.a, byteArrayExtra, aoos.b());
                } catch (aopx unused) {
                }
            }
            apzg apzgVar = this.h;
            hes hesVar = new hes();
            Bundle bundle = new Bundle();
            bundle.putByteArray("navigation_endpoint", apzgVar.toByteArray());
            hesVar.ae(bundle);
            hesVar.as = j;
            this.a = hesVar;
            hesVar.an = this;
            ex l = this.c.getSupportFragmentManager().l();
            l.y(R.id.reel_creation_container, this.a);
            l.a();
            return;
        }
        hes hesVar2 = (hes) e;
        this.a = hesVar2;
        hesVar2.an = this;
    }

    @Override // defpackage.gvf
    public final boolean c(int i, KeyEvent keyEvent) {
        hes hesVar = ((hep) this.a.am).a;
        dp e = hesVar.mL().e(R.id.reel_container);
        if (hesVar.aM(e)) {
            gxz gxzVar = ((gxk) e).aK;
            if (!gxzVar.d && gxzVar.a.f(i, keyEvent)) {
                return true;
            }
        }
        return super.c(i, keyEvent);
    }

    public final boolean d(int i, KeyEvent keyEvent) {
        hes hesVar = ((hep) this.a.am).a;
        dp e = hesVar.mL().e(R.id.reel_container);
        if (hesVar.aM(e)) {
            gxz gxzVar = ((gxk) e).aK;
            if (!gxzVar.d && gxzVar.a.g(i)) {
                return true;
            }
        }
        return super.c(i, keyEvent);
    }

    @Override // defpackage.her
    public final void b(boolean z) {
        avum avumVar;
        this.b = true;
        hkg hkgVar = this.d;
        if (!hkgVar.f) {
            String str = hkgVar.e;
            if (str == null) {
                zep.b("Frontend id should not be null.");
            } else {
                hkgVar.c.e(str, null, avum.UPLOAD_PROCESSOR_ABANDONMENT_REASON_CANCELLED_CREATION);
                if (hkgVar.f) {
                    hkgVar.d.B(hkg.a);
                }
            }
        } else {
            akyh akyhVar = hkgVar.d;
            String str2 = hkgVar.e;
            if (z) {
                avumVar = avum.UPLOAD_PROCESSOR_ABANDONMENT_REASON_CREATION_CLOSED_DRAFT_SAVED;
            } else {
                avumVar = avum.UPLOAD_PROCESSOR_ABANDONMENT_REASON_CREATION_CLOSED_NOTHING_TO_SAVE;
            }
            hkgVar.c("Failure while canceling upload.", akyhVar.e(str2, avumVar));
            hkgVar.d.B(hkg.a);
        }
        this.c.finish();
    }
}
