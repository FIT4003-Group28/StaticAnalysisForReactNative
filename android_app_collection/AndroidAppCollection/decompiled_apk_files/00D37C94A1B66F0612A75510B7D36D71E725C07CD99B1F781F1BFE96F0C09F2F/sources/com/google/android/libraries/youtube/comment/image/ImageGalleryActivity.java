package com.google.android.libraries.youtube.comment.image;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ImagePreviewSelectCommandOuterClass;
import com.google.protos.youtube.api.innertube.ImagePreviewSelectRendererOuterClass;
import com.google.protos.youtube.api.innertube.UpdateImagePreviewCommandOuterClass;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ImageGalleryActivity extends xpe implements xqc, xqi {
    public xrw b;
    public xqj c;
    private BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint d;

    public static Intent b(Context context, apzg apzgVar) {
        Intent intent = new Intent(context, ImageGalleryActivity.class);
        intent.putExtra("navigation_endpoint", apzgVar.toByteArray());
        return intent;
    }

    private final void i(dp dpVar, boolean z) {
        ex l = getSupportFragmentManager().l();
        l.y(R.id.fragment_container, dpVar);
        if (z) {
            l.s();
        }
        l.k();
    }

    private final void j(arig arigVar, boolean z) {
        xqp xqpVar = new xqp();
        Bundle bundle = new Bundle();
        bundle.putParcelable("image_preview_select_endpoint", aphq.k(arigVar));
        xqpVar.ae(bundle);
        i(xqpVar, z);
    }

    @Override // defpackage.xqc
    public final void c(xpb xpbVar, int i) {
        apkn apknVar = this.d.f;
        if (apknVar == null) {
            apknVar = apkn.a;
        }
        if (apknVar.b != 135384379) {
            BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint = this.d;
            if ((backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.b & 128) != 0) {
                apzg apzgVar = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.h;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                if (apzgVar.qn(ImagePreviewSelectCommandOuterClass.imagePreviewSelectCommand)) {
                    this.c.d();
                    BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint2 = this.d;
                    if (!backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint2.i) {
                        apzg apzgVar2 = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint2.h;
                        if (apzgVar2 == null) {
                            apzgVar2 = apzg.a;
                        }
                        j((arig) apzgVar2.qm(ImagePreviewSelectCommandOuterClass.imagePreviewSelectCommand), true);
                    }
                    xqj xqjVar = this.c;
                    xro a = xrp.a();
                    a.d(xpbVar.a);
                    a.b(xpbVar.f);
                    xqjVar.e(a.a());
                    return;
                }
            }
            onBackPressed();
            xrw xrwVar = this.b;
            BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint3 = this.d;
            xrwVar.c(backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint3.c, backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint3.d, xpbVar.a);
            return;
        }
        i(xpm.o(this.d, xpbVar.a), false);
    }

    @Override // defpackage.xqi
    public final void g(xrp xrpVar, apoj apojVar) {
        BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint = this.d;
        if (backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint != null) {
            this.b.c(backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.c, backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.d, xrpVar.a);
            if (!this.d.i) {
                return;
            }
            onBackPressed();
        }
    }

    public final void h(BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint) {
        int i = xqd.ag;
        backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.getClass();
        xqd xqdVar = new xqd();
        Bundle bundle = new Bundle();
        bundle.putParcelable("image_upload_endpoint", aphq.k(backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint));
        xqdVar.ae(bundle);
        xqdVar.e = this;
        i(xqdVar, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dt, defpackage.abp, defpackage.gb, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c.c(this);
        boolean z = true;
        setRequestedOrientation(1);
        setContentView(R.layout.image_gallery_activity);
        Bundle extras = getIntent().getExtras();
        apzg apzgVar = null;
        byte[] byteArray = extras != null ? extras.getByteArray("navigation_endpoint") : null;
        if (byteArray != null) {
            apzgVar = aafr.b(byteArray);
        }
        if (apzgVar == null || !apzgVar.qn(ImagePreviewSelectCommandOuterClass.imagePreviewSelectCommand)) {
            if (apzgVar == null || !apzgVar.qn(BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.backstageImageUploadEndpoint)) {
                zep.b("BackstageImageUploadEndpoint is missing.");
                return;
            }
            this.d = (BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint) apzgVar.qm(BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.backstageImageUploadEndpoint);
            String[] o = akdo.o(this, xqd.a);
            if (o.length == 0) {
                h(this.d);
                return;
            }
            BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint = this.d;
            String string = getResources().getString(R.string.image_gallery_permission_allow_access_description);
            String string2 = getResources().getString(R.string.image_gallery_permission_open_settings_description);
            if (o == null) {
                z = false;
            }
            aqxo.p(z);
            string.getClass();
            string2.getClass();
            akdo akdoVar = new akdo();
            Bundle bundle2 = new Bundle();
            bundle2.putStringArray("missing_permissions", o);
            bundle2.putCharSequence("allow_access_description", string);
            bundle2.putCharSequence("open_settings_description", string2);
            akdoVar.ae(bundle2);
            akdoVar.d = new xpt(this, backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint);
            i(akdoVar, false);
            return;
        }
        j((arig) apzgVar.qm(ImagePreviewSelectCommandOuterClass.imagePreviewSelectCommand), false);
    }

    @Override // defpackage.dt, android.app.Activity
    public final void onDestroy() {
        this.c.f(this);
        super.onDestroy();
    }

    @Override // defpackage.xqi
    public final void qW(xrp xrpVar) {
        Drawable drawable;
        BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint = this.d;
        if (backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint == null || !backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.i || (drawable = xrpVar.c) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = xrpVar.c.getIntrinsicHeight();
        if (intrinsicWidth == 0 || intrinsicHeight == 0) {
            return;
        }
        xro b = xrpVar.b();
        b.b = xxs.d(intrinsicWidth, intrinsicHeight);
        xrp a = b.a();
        xqj xqjVar = this.c;
        BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint2 = this.d;
        apoj apojVar = null;
        if ((backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint2.b & 128) != 0) {
            apzg apzgVar = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint2.h;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            arig arigVar = (arig) apzgVar.qm(ImagePreviewSelectCommandOuterClass.imagePreviewSelectCommand);
            if (arigVar != null && (arigVar.b & 1) != 0) {
                aunb aunbVar = arigVar.c;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                arih arihVar = (arih) aunbVar.qm(ImagePreviewSelectRendererOuterClass.imagePreviewSelectRenderer);
                if (arihVar != null && (arihVar.b & 8) != 0) {
                    apzg apzgVar2 = arihVar.f;
                    if (apzgVar2 == null) {
                        apzgVar2 = apzg.a;
                    }
                    avsy avsyVar = (avsy) apzgVar2.qm(UpdateImagePreviewCommandOuterClass.updateImagePreviewCommand);
                    if (avsyVar != null && (avsyVar.b & 1) != 0) {
                        aunb aunbVar2 = avsyVar.c;
                        if (aunbVar2 == null) {
                            aunbVar2 = aunb.a;
                        }
                        if (aunbVar2.qn(ButtonRendererOuterClass.buttonRenderer)) {
                            aunb aunbVar3 = avsyVar.c;
                            if (aunbVar3 == null) {
                                aunbVar3 = aunb.a;
                            }
                            aopc aopcVar = (aopc) apoj.a.createBuilder();
                            arag aragVar = ((apoj) aunbVar3.qm(ButtonRendererOuterClass.buttonRenderer)).i;
                            if (aragVar == null) {
                                aragVar = arag.a;
                            }
                            aopcVar.copyOnWrite();
                            apoj apojVar2 = (apoj) aopcVar.instance;
                            aragVar.getClass();
                            apojVar2.i = aragVar;
                            apojVar2.b |= 256;
                            aopc aopcVar2 = (aopc) apzg.a.createBuilder();
                            aopcVar2.e(ImagePreviewSelectCommandOuterClass.imagePreviewSelectCommand, arigVar);
                            aopcVar.copyOnWrite();
                            apoj apojVar3 = (apoj) aopcVar.instance;
                            apzg apzgVar3 = (apzg) aopcVar2.mo39build();
                            apzgVar3.getClass();
                            apojVar3.p = apzgVar3;
                            apojVar3.b |= 32768;
                            apojVar = (apoj) aopcVar.mo39build();
                        }
                    }
                }
            }
        }
        xqjVar.b(a, apojVar);
    }
}
