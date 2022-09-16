package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mnn  reason: default package */
/* loaded from: classes3.dex */
public final class mnn extends kqs {
    public final ImageView o;
    final /* synthetic */ mno p;
    private final ajrp q;
    private final int r;
    private final PlaylistThumbnailView s;
    private final PlaylistThumbnailView t;
    private final PlaylistThumbnailView u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mnn(mno mnoVar, Context context, ajmy ajmyVar, int i, gem gemVar, aafo aafoVar, ajyc ajycVar, ajxz ajxzVar) {
        super(context, ajmyVar, ajycVar, i, ajxzVar);
        this.p = mnoVar;
        this.q = new ajrp(aafoVar, gemVar);
        this.r = i;
        this.s = (PlaylistThumbnailView) this.d.findViewById(R.id.playlist_thumbnail_start);
        this.t = (PlaylistThumbnailView) this.d.findViewById(R.id.playlist_thumbnail_top_end);
        this.u = (PlaylistThumbnailView) this.d.findViewById(R.id.playlist_thumbnail);
        this.o = (ImageView) this.d.findViewById(R.id.channel_avatar);
    }

    public static final apzg o(apuq apuqVar) {
        apur apurVar = apuqVar.c;
        if (apurVar == null) {
            apurVar = apur.a;
        }
        if ((apurVar.b & 2) != 0) {
            apur apurVar2 = apuqVar.c;
            if (apurVar2 == null) {
                apurVar2 = apur.a;
            }
            apzg apzgVar = apurVar2.d;
            return apzgVar == null ? apzg.a : apzgVar;
        }
        return null;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a0  */
    @Override // defpackage.ajru
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void oK(defpackage.ajrs r11, defpackage.aukb r12) {
        /*
            Method dump skipped, instructions count: 831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mnn.oK(ajrs, aukb):void");
    }

    @Override // defpackage.kqs, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.q.c();
    }
}
