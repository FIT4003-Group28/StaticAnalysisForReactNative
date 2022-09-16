package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ajsl  reason: default package */
/* loaded from: classes.dex */
public abstract class ajsl implements ajru {
    public aadd w;

    protected abstract void d(ajrs ajrsVar, Object obj);

    protected abstract byte[] e(Object obj);

    protected boolean kB() {
        aadd aaddVar = this.w;
        if (aaddVar == null) {
            return false;
        }
        asvx asvxVar = aaddVar.a().m;
        if (asvxVar == null) {
            asvxVar = asvx.a;
        }
        aski askiVar = asvxVar.c;
        if (askiVar == null) {
            askiVar = aski.a;
        }
        return askiVar.i;
    }

    protected boolean l() {
        return false;
    }

    @Override // defpackage.ajru
    public final void oK(ajrs ajrsVar, Object obj) {
        byte[] e = e(obj);
        if (e != null && e.length > 0) {
            acte acteVar = new acte(e);
            if (!kB()) {
                ajrsVar.a.u(acteVar, null);
            } else {
                a().setTag(R.id.visual_element_container_tag, new actd(acteVar, l()));
            }
        }
        d(ajrsVar, obj);
    }
}
