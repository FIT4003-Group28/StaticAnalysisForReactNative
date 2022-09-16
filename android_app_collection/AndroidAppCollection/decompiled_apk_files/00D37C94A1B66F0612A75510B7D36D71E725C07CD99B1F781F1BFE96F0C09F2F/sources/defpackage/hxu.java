package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.DownloadReelItem$DownloadReelItemEndpoint;
import java.util.Map;
/* compiled from: PG */
/* renamed from: hxu  reason: default package */
/* loaded from: classes3.dex */
public final class hxu implements aafl {
    public final Context a;
    public final iee b;
    public ihm c;
    public int d = 0;
    private final afvn e;
    private final afxq f;
    private final yqw g;

    public hxu(Context context, afvn afvnVar, afxq afxqVar, yqw yqwVar, iee ieeVar) {
        this.a = context;
        afvnVar.getClass();
        this.e = afvnVar;
        this.f = afxqVar;
        yqwVar.getClass();
        this.g = yqwVar;
        ieeVar.getClass();
        this.b = ieeVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        this.d = this.b.a();
        AlertDialog create = new AlertDialog.Builder(this.a).setMessage(R.string.download_reel_item_in_progress).create();
        create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: hxr
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                hxu hxuVar = hxu.this;
                hxuVar.b.c(hxuVar.d);
                hxuVar.d = 0;
            }
        });
        create.setButton(-2, this.a.getString(17039360), new DialogInterface.OnClickListener() { // from class: hxq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                hxu.this.c.a = true;
            }
        });
        create.show();
        ihm ihmVar = new ihm(((DownloadReelItem$DownloadReelItemEndpoint) apzgVar.qm(DownloadReelItem$DownloadReelItemEndpoint.downloadReelItemEndpoint)).b, this.e.c(), this.f, this.a.getContentResolver(), new hxt(this, create));
        this.c = ihmVar;
        this.g.a(ihmVar);
    }
}
