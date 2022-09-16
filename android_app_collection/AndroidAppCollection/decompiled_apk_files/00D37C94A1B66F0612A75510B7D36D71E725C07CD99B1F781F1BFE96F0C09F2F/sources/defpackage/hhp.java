package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: hhp  reason: default package */
/* loaded from: classes3.dex */
public abstract class hhp {
    public List k = new ArrayList();
    public String l;

    public static File C(Context context) {
        File file = new File(context.getExternalFilesDir(null), "shorts_project");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static boolean D(hhp hhpVar) {
        return hhpVar != null && "DraftProject".equals(hhpVar.l());
    }

    public static boolean E(hhp hhpVar) {
        return hhpVar != null && "TrimDraft".equals(hhpVar.l());
    }

    public vqr B() {
        return null;
    }

    public ampq c() {
        return amon.a;
    }

    public abstract ampq d();

    public ampq e() {
        return amon.a;
    }

    public File k() {
        return null;
    }

    public abstract String l();

    public void m() {
    }

    public void n() {
    }

    public void o(ShortsCreationSelectedTrack shortsCreationSelectedTrack) {
    }

    public void p(String str) {
    }

    public void q(Bundle bundle) {
        bundle.putString("SHORTS_PROJECT_ACTIVE_PROJECT_ID", l());
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (auuv auuvVar : this.k) {
            arrayList.add(Integer.valueOf(auuvVar.l));
        }
        bundle.putIntegerArrayList("SHORTS_PROJECT_CREATION_SURFACES", arrayList);
        bundle.putString("SHORTS_PROJECT_FLOW_NONCE_KEY", this.l);
    }

    public void r(auuv auuvVar) {
        this.k.add(auuvVar);
    }

    public void s() {
    }
}
