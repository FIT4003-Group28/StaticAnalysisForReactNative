package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;
/* compiled from: PG */
/* renamed from: hkd  reason: default package */
/* loaded from: classes3.dex */
public final class hkd implements hki {
    private final dt a;
    private final hkl b;

    public hkd(dt dtVar, hkl hklVar) {
        this.a = dtVar;
        this.b = hklVar;
    }

    @Override // defpackage.hki
    public final void a(hkk hkkVar) {
        Intent intent = new Intent(this.a.getApplicationContext(), UploadActivity.class);
        intent.setAction("com.google.android.youtube.intent.action.INTERNAL_UPLOAD");
        intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_upload_flow_source", hkkVar.a.k);
        intent.setDataAndType(hkkVar.b, "video/*");
        intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_hide_preview", true);
        Uri uri = hkkVar.c;
        if (uri != null) {
            intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_edited_video_uri", uri);
        }
        int i = hkkVar.o;
        int i2 = i - 1;
        if (i != 0) {
            intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_upload_flow_flavor", i2);
            String str = hkkVar.e;
            if (str != null) {
                intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_shorts_project_path", str);
            }
            Long l = hkkVar.f;
            if (l != null) {
                intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_video_duration_ms", l.longValue());
            }
            if (hkkVar.d != null) {
                aopc aopcVar = (aopc) apzg.a.createBuilder();
                aopcVar.e(atno.b, hkkVar.d);
                intent.putExtra("navigation_endpoint", ((apzg) aopcVar.mo39build()).toByteArray());
            }
            awbb awbbVar = hkkVar.j;
            if (awbbVar != null) {
                intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_video_shorts_creation", awbbVar.toByteArray());
            }
            if (hkkVar.k) {
                intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_uses_yt_audio_source", true);
            }
            if (hkkVar.l) {
                intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_is_shorts_eligible", true);
            }
            avvf avvfVar = this.b.a.a().h;
            if (avvfVar == null) {
                avvfVar = avvf.a;
            }
            int i3 = 0;
            if (avvfVar.w) {
                intent.putExtra("navigate_to_my_uploads", false);
            }
            String str2 = hkkVar.m;
            if (str2 != null) {
                intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_frontend_upload_id", str2);
            }
            String str3 = hkkVar.g;
            if (str3 != null) {
                intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_flow_logging_nonce", str3);
            }
            amuk amukVar = hkkVar.i;
            if (amukVar != null) {
                int[] iArr = new int[amukVar.size()];
                amuk amukVar2 = hkkVar.i;
                int size = amukVar2.size();
                int i4 = 0;
                while (i3 < size) {
                    iArr[i4] = ((auuv) amukVar2.get(i3)).l;
                    i3++;
                    i4++;
                }
                intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_creation_surfaces", iArr);
            }
            String str4 = hkkVar.h;
            if (str4 != null && !str4.isEmpty()) {
                intent.putExtra("com.google.android.libraries.youtube.upload.extra_upload_activity_preset_pending_upload_video_thumbnail_path", hkkVar.h);
            }
            String str5 = hkkVar.n;
            if (str5 != null) {
                intent.putExtra("android.intent.extra.TITLE", str5);
            }
            this.a.startActivityForResult(intent, 902);
            return;
        }
        throw null;
    }
}
