package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.libraries.video.editablevideo.EditableVideoEdits;
import com.google.android.libraries.video.media.VideoMetaData;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: hhl  reason: default package */
/* loaded from: classes3.dex */
public final class hhl {
    public final azpa a = azpa.ar();
    public final acsf b;
    private final Context c;

    public hhl(Context context, acse acseVar) {
        this.c = context;
        this.b = acseVar;
    }

    public final int a(Bundle bundle) {
        hhp hhpVar;
        int i = 0;
        if (bundle != null) {
            Context context = this.c;
            if ("DraftProject".equals(bundle.getString("SHORTS_PROJECT_ACTIVE_PROJECT_ID", ""))) {
                hhpVar = hhn.b(bundle.getString("SHORTS_PROJECT_ACTIVE_PROJECT_ID"), bundle, context, bundle.getString("SHORTS_PROJECT_FLOW_NONCE_KEY"));
            } else if ("TrimDraft".equals(bundle.getString("SHORTS_PROJECT_ACTIVE_PROJECT_ID", ""))) {
                EditableVideoEdits editableVideoEdits = (EditableVideoEdits) bundle.getParcelable("EDITABLE_VIDEO_EDITS_KEY");
                VideoMetaData videoMetaData = (VideoMetaData) bundle.getParcelable("EDITABLE_VIDEO_METADATA_KEY");
                Uri uri = (Uri) bundle.getParcelable("SOURCE_VIDEO_URI_KEY");
                vqr vqrVar = (editableVideoEdits == null || videoMetaData == null) ? null : new vqr(editableVideoEdits, videoMetaData);
                if (uri == null) {
                    uri = Uri.EMPTY;
                }
                hhpVar = new hhq(vqrVar, uri, bundle.getLong("TIMELINE_WINDOW_START_US_KEY", 0L), bundle.getString("SHORTS_PROJECT_FLOW_NONCE_KEY"));
            } else {
                hhpVar = null;
            }
            if (hhpVar != null) {
                ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("SHORTS_PROJECT_CREATION_SURFACES");
                List list = hhpVar.k;
                list.clear();
                if (integerArrayList != null) {
                    int size = integerArrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        list.add(auuv.b(integerArrayList.get(i2).intValue()));
                    }
                }
            }
        } else {
            hhpVar = null;
        }
        if (hhpVar != null) {
            i = 1;
        } else {
            hhpVar = hhn.b("DraftProject", null, this.c, this.b.a());
            if (hhpVar != null) {
                i = 2;
            } else {
                hhpVar = hhn.a(this.c, this.b.a());
            }
        }
        this.a.c(hhpVar);
        return i;
    }

    public final hhp b() {
        return (hhp) this.a.at();
    }

    public final ayoi c() {
        return this.a.W();
    }

    public final void d() {
        a(null);
    }

    public final void e() {
        hhp b = b();
        if (b == null) {
            return;
        }
        i(3, b.l, b.k);
    }

    public final void f() {
        hhp b = b();
        if (b == null) {
            return;
        }
        i(5, b.l, b.k);
    }

    public final void g(auuv auuvVar) {
        auuvVar.getClass();
        h(null, Arrays.asList(auuvVar));
    }

    public final void h(String str, List list) {
        String[] list2;
        if (!(this.a.at() instanceof hhn)) {
            zep.b("reshootProject() called on a non-camera project; abort");
            return;
        }
        hhn hhnVar = (hhn) this.a.at();
        if (hhnVar != null) {
            String str2 = hhnVar.c;
            if (str2.length() != 0) {
                "Delete project: ".concat(str2);
            }
            File k = hhnVar.k();
            if (!hhnVar.i.isEmpty()) {
                File g = hhnVar.g(hhnVar.i);
                if (g.exists() && !g.delete()) {
                    String valueOf = String.valueOf(g);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                    sb.append("Failed to delete composed video ");
                    sb.append(valueOf);
                    zep.b(sb.toString());
                }
            }
            if (k.isDirectory() && (list2 = k.list()) != null) {
                for (String str3 : list2) {
                    new File(k, str3).delete();
                }
            }
            if (k.exists()) {
                k.delete();
            }
        }
        Context context = this.c;
        if (str == null) {
            str = this.b.a();
        }
        hhn a = hhn.a(context, str);
        if (list != null) {
            a.k = list;
        }
        this.a.c(a);
    }

    public final void i(int i, String str, List list) {
        if (str == null || list == null) {
            return;
        }
        aopa createBuilder = auuu.a.createBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            auuv auuvVar = (auuv) it.next();
            createBuilder.copyOnWrite();
            auuu auuuVar = (auuu) createBuilder.instance;
            auuvVar.getClass();
            aopq aopqVar = auuuVar.b;
            if (!aopqVar.c()) {
                auuuVar.b = aopi.mutableCopy(aopqVar);
            }
            auuuVar.b.g(auuvVar.l);
        }
        acsf acsfVar = this.b;
        acsd acsdVar = new acsd(i - 1, 8);
        aopa createBuilder2 = aqyu.a.createBuilder();
        auuu auuuVar2 = (auuu) createBuilder.mo39build();
        createBuilder2.copyOnWrite();
        aqyu aqyuVar = (aqyu) createBuilder2.instance;
        auuuVar2.getClass();
        aqyuVar.f = auuuVar2;
        aqyuVar.b |= 8;
        acsdVar.a = (aqyu) createBuilder2.mo39build();
        acsfVar.c(acsdVar, aqzj.FLOW_TYPE_SHORTS_CREATION, str);
    }
}
