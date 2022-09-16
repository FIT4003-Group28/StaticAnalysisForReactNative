package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.widget.GridLayoutManager;
import android.view.ViewGroup;
import com.google.protos.youtube.api.innertube.BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint;
import com.google.protos.youtube.api.innertube.FancyDismissibleDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.PostImagePickerRendererOuterClass;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: xqs  reason: default package */
/* loaded from: classes4.dex */
public final class xqs extends xo {
    public final Context d;
    public final GridLayoutManager e;
    public final ql f;
    public final BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint g;
    public aufv h;
    public final List i;
    public final xqb j;
    public final qj k;
    public final ne l;

    public xqs(Context context, GridLayoutManager gridLayoutManager, xqb xqbVar, BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint, amuk amukVar) {
        context.getClass();
        this.d = context;
        gridLayoutManager.getClass();
        this.e = gridLayoutManager;
        this.j = xqbVar;
        this.g = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint;
        aunb aunbVar = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.j;
        if ((aunbVar == null ? aunb.a : aunbVar).qn(PostImagePickerRendererOuterClass.postImagePickerRenderer)) {
            aunb aunbVar2 = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.j;
            this.h = (aufv) (aunbVar2 == null ? aunb.a : aunbVar2).qm(PostImagePickerRendererOuterClass.postImagePickerRenderer);
        }
        this.i = new ArrayList();
        int i = 0;
        for (int size = amukVar.size(); i < size; size = size) {
            xrp xrpVar = (xrp) amukVar.get(i);
            this.i.add(new xpb(xrpVar.a, null, 0L, 0, 0, xrpVar.b, true));
            i++;
        }
        qj qjVar = new qj(context.getContentResolver());
        this.k = qjVar;
        this.f = new ql(xpb.class, qjVar, new qk(this));
        this.l = new xqr(this);
    }

    @Override // defpackage.xo
    public final int b() {
        return this.f.l;
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ yo f(ViewGroup viewGroup, int i) {
        return new yo(new xrm(this.d));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object[]] */
    @Override // defpackage.xo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void o(defpackage.yo r9, int r10) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xqs.o(yo, int):void");
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void p(yo yoVar) {
        xrm D = yoVar.D();
        D.b.setImageBitmap(null);
        D.b.setOnClickListener(null);
    }

    public final void w() {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        aunb aunbVar = this.g.g;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        aqxq aqxqVar = (aqxq) aunbVar.qm(FancyDismissibleDialogRendererOuterClass.fancyDismissibleDialogRenderer);
        AlertDialog.Builder builder = new AlertDialog.Builder(this.d);
        if ((aqxqVar.b & 2) != 0) {
            aragVar = aqxqVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        AlertDialog.Builder title = builder.setTitle(ajgl.b(aragVar));
        if ((aqxqVar.b & 1) != 0) {
            aragVar2 = aqxqVar.c;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        AlertDialog.Builder message = title.setMessage(ajgl.b(aragVar2));
        if ((aqxqVar.b & 4) != 0) {
            aragVar3 = aqxqVar.e;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        yce.g(message.setPositiveButton(ajgl.b(aragVar3), (DialogInterface.OnClickListener) null).create());
    }
}
