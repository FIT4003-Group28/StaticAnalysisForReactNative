package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.google.android.libraries.youtube.account.image.CropActivity;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint;
import com.google.protos.youtube.api.innertube.EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint;
import com.google.protos.youtube.api.innertube.GetPhotoEndpointOuterClass$GetPhotoEndpoint;
import com.google.protos.youtube.api.innertube.UploadPhotoEndpointOuterClass$UploadPhotoEndpoint;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: wax  reason: default package */
/* loaded from: classes4.dex */
public final class wax extends wao {
    private static final Intent an = new Intent();
    private static final aoos ao;
    private static final Integer ap;
    public was a;
    public aafo ae;
    public ajmr af;
    public yzj ag;
    public SharedPreferences ah;
    public aadd ai;
    public Uri aj;
    public String ak;
    public String al;
    public boolean am;
    private GetPhotoEndpointOuterClass$GetPhotoEndpoint aq;
    private UploadPhotoEndpointOuterClass$UploadPhotoEndpoint ar;
    private Uri as;
    private boolean at;
    private boolean au;
    public way b;
    public ScheduledExecutorService c;
    public Executor d;
    public aauj e;

    static {
        aoos c = aoos.c();
        c.e(UploadPhotoEndpointOuterClass$UploadPhotoEndpoint.uploadPhotoEndpoint);
        c.e(EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint.editChannelAvatarEndpoint);
        c.e(EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint.editChannelBannerEndpoint);
        ao = c;
        ap = 90;
    }

    private static File aE(Context context) {
        try {
            File file = new File(context.getCacheDir(), "photos");
            if (!file.exists()) {
                file.mkdir();
            }
            return File.createTempFile("image", ".jpeg", file);
        } catch (IOException e) {
            throw new wat("Failed to create temp image file.", e);
        }
    }

    private final void aF() {
        arag aragVar;
        GetPhotoEndpointOuterClass$GetPhotoEndpoint getPhotoEndpointOuterClass$GetPhotoEndpoint = this.aq;
        if ((getPhotoEndpointOuterClass$GetPhotoEndpoint.b & 4) != 0) {
            try {
                ardn ardnVar = getPhotoEndpointOuterClass$GetPhotoEndpoint.e;
                if (ardnVar == null) {
                    ardnVar = ardn.a;
                }
                Intent intent = new Intent(mJ(), CropActivity.class);
                intent.setData(this.as);
                Uri fromFile = Uri.fromFile(aE(rb()));
                this.aj = fromFile;
                intent.putExtra("output", fromFile);
                if ((ardnVar.b & 64) != 0) {
                    arag aragVar2 = ardnVar.i;
                    if (aragVar2 == null) {
                        aragVar2 = arag.a;
                    }
                    intent.putExtra("cropLabel", aafv.a(aragVar2, this.a.c(), false));
                }
                intent.putExtra("widthRatio", ardnVar.c);
                intent.putExtra("heightRatio", ardnVar.d);
                int i = ardnVar.e;
                if (i > 0) {
                    intent.putExtra("minWidth", i);
                }
                int i2 = ardnVar.f;
                if (i2 > 0) {
                    intent.putExtra("minHeight", i2);
                }
                int i3 = ardnVar.g;
                if (i3 > 0) {
                    intent.putExtra("minOutputWidth", i3);
                }
                int i4 = ardnVar.h;
                if (i4 > 0) {
                    intent.putExtra("minOutputHeight", i4);
                }
                if ((ardnVar.b & 512) != 0) {
                    arag aragVar3 = ardnVar.l;
                    if (aragVar3 == null) {
                        aragVar3 = arag.a;
                    }
                    intent.putExtra("visualCropLabel", aafv.a(aragVar3, this.a.c(), false));
                }
                int i5 = ardnVar.j;
                if (i5 > 0) {
                    intent.putExtra("visualWidthRatio", i5);
                }
                int i6 = ardnVar.k;
                if (i6 > 0) {
                    intent.putExtra("visualHeightRatio", i6);
                }
                if ((ardnVar.b & 2048) != 0) {
                    arag aragVar4 = ardnVar.n;
                    if (aragVar4 == null) {
                        aragVar4 = arag.a;
                    }
                    intent.putExtra("visualDoubleCropLabel", aafv.a(aragVar4, this.a.c(), false));
                }
                int i7 = ardnVar.m;
                if (i7 > 0) {
                    intent.putExtra("visualDoubleWidthRatio", i7);
                }
                GetPhotoEndpointOuterClass$GetPhotoEndpoint getPhotoEndpointOuterClass$GetPhotoEndpoint2 = this.aq;
                if ((getPhotoEndpointOuterClass$GetPhotoEndpoint2.b & 8) != 0) {
                    aragVar = getPhotoEndpointOuterClass$GetPhotoEndpoint2.f;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                intent.putExtra("cropInfo", aafv.a(aragVar, this.a.c(), true));
                startActivityForResult(intent, 2);
                return;
            } catch (wat e) {
                p(rh().getString(R.string.image_upload_something_went_wrong), e);
                return;
            }
        }
        this.aj = this.as;
        aI();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0096 A[Catch: wat -> 0x00ab, TRY_ENTER, TryCatch #1 {wat -> 0x00ab, blocks: (B:15:0x003f, B:22:0x0073, B:24:0x0078, B:41:0x0096, B:43:0x009b, B:44:0x009e, B:45:0x009f), top: B:51:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009b A[Catch: wat -> 0x00ab, TryCatch #1 {wat -> 0x00ab, blocks: (B:15:0x003f, B:22:0x0073, B:24:0x0078, B:41:0x0096, B:43:0x009b, B:44:0x009e, B:45:0x009f), top: B:51:0x003f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aG() {
        /*
            r10 = this;
            r0 = 1
            r10.am = r0
            yzj r0 = r10.ag
            com.google.protos.youtube.api.innertube.UploadPhotoEndpointOuterClass$UploadPhotoEndpoint r1 = r10.ar
            int r2 = r1.b
            r2 = r2 & 128(0x80, float:1.794E-43)
            r3 = 0
            if (r2 == 0) goto L15
            arag r1 = r1.h
            if (r1 != 0) goto L16
            arag r1 = defpackage.arag.a
            goto L16
        L15:
            r1 = r3
        L16:
            android.text.Spanned r1 = defpackage.ajgl.b(r1)
            java.lang.String r1 = r1.toString()
            r0.d(r1)
            dt r0 = r10.mJ()
            com.google.protos.youtube.api.innertube.UploadPhotoEndpointOuterClass$UploadPhotoEndpoint r1 = r10.ar
            avhn r1 = r1.g
            if (r1 != 0) goto L2d
            avhn r1 = defpackage.avhn.a
        L2d:
            aopu r1 = r1.c
            java.util.Iterator r1 = r1.iterator()
        L33:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb2
            java.lang.Object r2 = r1.next()
            avhm r2 = (defpackage.avhm) r2
            android.net.Uri r4 = r10.aj     // Catch: defpackage.wat -> Lab
            int r5 = r2.d     // Catch: defpackage.wat -> Lab
            int r6 = r2.e     // Catch: defpackage.wat -> Lab
            if (r5 == 0) goto L9f
            if (r6 == 0) goto L9f
            android.content.ContentResolver r7 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L8b
            java.io.InputStream r4 = r7.openInputStream(r4)     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L8b
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r4)     // Catch: java.lang.Throwable -> L87 java.io.IOException -> L8b
            android.graphics.Bitmap r5 = defpackage.zag.d(r4, r5, r6)     // Catch: java.lang.Throwable -> L81 java.io.IOException -> L84
            java.io.File r6 = aE(r0)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L7f
            android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L7f
            java.lang.Integer r8 = defpackage.wax.ap     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L7f
            int r8 = r8.intValue()     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L7f
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L7f
            r9.<init>(r6)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L7f
            r5.compress(r7, r8, r9)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L7f
            android.net.Uri r6 = android.net.Uri.fromFile(r6)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L7f
            if (r4 == 0) goto L76
            r4.recycle()     // Catch: defpackage.wat -> Lab
        L76:
            if (r5 == 0) goto L7b
            r5.recycle()     // Catch: defpackage.wat -> Lab
        L7b:
            r4 = r6
            goto L9f
        L7d:
            r2 = move-exception
            goto L94
        L7f:
            r2 = move-exception
            goto L8e
        L81:
            r2 = move-exception
            r5 = r3
            goto L94
        L84:
            r2 = move-exception
            r5 = r3
            goto L8e
        L87:
            r2 = move-exception
            r4 = r3
            r5 = r4
            goto L94
        L8b:
            r2 = move-exception
            r4 = r3
            r5 = r4
        L8e:
            wat r6 = new wat     // Catch: java.lang.Throwable -> L7d
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L7d
            throw r6     // Catch: java.lang.Throwable -> L7d
        L94:
            if (r4 == 0) goto L99
            r4.recycle()     // Catch: defpackage.wat -> Lab
        L99:
            if (r5 == 0) goto L9e
            r5.recycle()     // Catch: defpackage.wat -> Lab
        L9e:
            throw r2     // Catch: defpackage.wat -> Lab
        L9f:
            java.lang.String r2 = r2.c     // Catch: defpackage.wat -> Lab
            android.net.Uri r2 = defpackage.zgt.j(r2)     // Catch: defpackage.wat -> Lab
            ajmr r5 = r10.af     // Catch: defpackage.wat -> Lab
            r5.f(r2, r4)     // Catch: defpackage.wat -> Lab
            goto L33
        Lab:
            r2 = move-exception
            java.lang.String r4 = "Exception scaling image "
            defpackage.zep.d(r4, r2)
            goto L33
        Lb2:
            was r0 = r10.a
            java.lang.String r1 = r10.al
            android.net.Uri r2 = r10.aj
            r0.i(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wax.aG():void");
    }

    private final void aH() {
        this.am = true;
        this.a.g();
    }

    private final void aI() {
        if (this.aj == null) {
            p(rh().getString(R.string.image_upload_something_went_wrong), new wat());
            return;
        }
        apok apokVar = this.aq.d;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        apoj apojVar = apokVar.c;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        if ((apojVar.b & 32768) == 0) {
            p(rh().getString(R.string.image_upload_something_went_wrong), new wat("No endpoint to route after cropping an image."));
            return;
        }
        aafo aafoVar = this.ae;
        apzg apzgVar = apojVar.p;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        try {
            apzgVar = (apzg) aopi.parseFrom(apzg.a, apzgVar.toByteArray(), ao);
        } catch (aopx e) {
            p(rh().getString(R.string.image_upload_something_went_wrong), new wat("Invalid protocol buffer.", e));
        }
        aafoVar.a(apzgVar);
    }

    private final void aJ() {
        Intent intent;
        if (this.am) {
            this.a.d();
            return;
        }
        UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint = this.ar;
        if (uploadPhotoEndpointOuterClass$UploadPhotoEndpoint != null) {
            r(uploadPhotoEndpointOuterClass$UploadPhotoEndpoint);
        } else if (!this.at) {
            int b = arey.b(this.aq.c);
            if (b == 0) {
                b = 1;
            }
            int i = b - 1;
            if (i == 1) {
                try {
                    if (Build.VERSION.SDK_INT < 23 || aK("android.permission.CAMERA")) {
                        intent = new Intent("android.media.action.IMAGE_CAPTURE");
                        Uri a = gf.a(rb(), "com.google.android.youtube.fileprovider", aE(rb()));
                        this.as = a;
                        intent.putExtra("output", a);
                        intent.setClipData(ClipData.newUri(rb().getContentResolver(), "images", this.as));
                        intent.setFlags(3);
                    } else {
                        intent = an;
                    }
                } catch (wat e) {
                    p(rh().getString(R.string.image_upload_something_went_wrong), e);
                    return;
                }
            } else if (i == 2) {
                if (Build.VERSION.SDK_INT < 23 || aK("android.permission.READ_EXTERNAL_STORAGE")) {
                    intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.setType("image/*");
                    intent.addCategory("android.intent.category.OPENABLE");
                } else {
                    intent = an;
                }
            } else {
                p(rh().getString(R.string.image_upload_something_went_wrong), new wat("Unknown get image action."));
                return;
            }
            if (intent == an) {
                return;
            }
            startActivityForResult(intent, 1);
        } else if (!this.au) {
            aF();
        } else {
            aI();
        }
    }

    private final boolean aK(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i <= 0; i++) {
            String str = strArr[i];
            if (ake.c(mJ(), str) == -1) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        Set<String> stringSet = this.ah.getStringSet("permissions_requested", null);
        if (stringSet != null && !stringSet.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (stringSet.contains(str2) && !au(str2)) {
                    arrayList2.add(str2);
                    it.remove();
                }
            }
        }
        if (!arrayList.isEmpty()) {
            HashSet hashSet = new HashSet(arrayList);
            if (stringSet != null) {
                hashSet.addAll(stringSet);
            }
            this.ah.edit().putStringSet("permissions_requested", hashSet).commit();
            ab((String[]) arrayList.toArray(new String[0]), 3);
        } else if (!arrayList2.isEmpty()) {
            this.am = true;
            aqxo.p(!arrayList2.isEmpty());
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("permissions", arrayList2);
            wba wbaVar = new wba();
            wbaVar.ae(bundle);
            eo eoVar = this.z;
            eoVar.getClass();
            ex l = eoVar.l();
            l.r(wbaVar, "photo_upload_permission_fragment");
            l.a();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static wax o(GetPhotoEndpointOuterClass$GetPhotoEndpoint getPhotoEndpointOuterClass$GetPhotoEndpoint) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("arg_get_photo_endpoint", getPhotoEndpointOuterClass$GetPhotoEndpoint.toByteArray());
        wax waxVar = new wax();
        waxVar.ae(bundle);
        return waxVar;
    }

    @Override // defpackage.dp
    public final void R(Bundle bundle) {
        super.R(bundle);
        try {
            byte[] byteArray = this.m.getByteArray("arg_get_photo_endpoint");
            aoos aoosVar = ao;
            this.aq = (GetPhotoEndpointOuterClass$GetPhotoEndpoint) aopi.parseFrom(GetPhotoEndpointOuterClass$GetPhotoEndpoint.a, byteArray, aoosVar);
            if (bundle != null) {
                this.as = (Uri) bundle.getParcelable("arg_image_uri");
                this.aj = (Uri) bundle.getParcelable("arg_crop_uri");
                this.ak = bundle.getString("arg_external_channel_id");
                this.al = bundle.getString("arg_encrypted_blob_id");
                this.at = bundle.getBoolean("arg_get_image_finished", this.at);
                this.au = bundle.getBoolean("arg_crop_image_finished", this.au);
                this.am = bundle.getBoolean("arg_dismissed", this.am);
                if (bundle.containsKey("arg_upload_photo_endpoint")) {
                    try {
                        this.ar = (UploadPhotoEndpointOuterClass$UploadPhotoEndpoint) aopi.parseFrom(UploadPhotoEndpointOuterClass$UploadPhotoEndpoint.a, bundle.getByteArray("arg_upload_photo_endpoint"), aoosVar);
                    } catch (aopx unused) {
                    }
                }
            }
            aJ();
        } catch (aopx unused2) {
            throw new RuntimeException("Miracles do happen");
        }
    }

    @Override // defpackage.dp
    public final void X(int i, String[] strArr, int[] iArr) {
        aqxo.p(i == 3);
        for (int i2 : iArr) {
            if (i2 == -1) {
                aH();
                return;
            }
        }
        aJ();
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        Uri uri = this.as;
        if (uri != null) {
            bundle.putParcelable("arg_image_uri", uri);
        }
        Uri uri2 = this.aj;
        if (uri2 != null) {
            bundle.putParcelable("arg_crop_uri", uri2);
        }
        String str = this.ak;
        if (str != null) {
            bundle.putString("arg_external_channel_id", str);
        }
        String str2 = this.al;
        if (str2 != null) {
            bundle.putString("arg_encrypted_blob_id", str2);
        }
        if (this.at) {
            bundle.putBoolean("arg_get_image_finished", true);
        }
        if (this.au) {
            bundle.putBoolean("arg_crop_image_finished", true);
        }
        if (this.am) {
            bundle.putBoolean("arg_dismissed", true);
        }
        UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint = this.ar;
        if (uploadPhotoEndpointOuterClass$UploadPhotoEndpoint != null) {
            bundle.putByteArray("arg_upload_photo_endpoint", uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.toByteArray());
        }
    }

    public final void p(String str, wat watVar) {
        this.am = true;
        this.ag.d(str);
        this.a.h(watVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r(UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint) {
        arag aragVar;
        uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.getClass();
        this.ar = uploadPhotoEndpointOuterClass$UploadPhotoEndpoint;
        if (this.al != null) {
            q();
            return;
        }
        aowa aowaVar = this.ai.a().x;
        if (aowaVar == null) {
            aowaVar = aowa.a;
        }
        boolean z = false;
        if (aowaVar.b) {
            if ((uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.b & 4) != 0) {
                z = true;
            }
            z = !z;
        } else {
            int i = uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.b;
            if ((i & 4) == 0 || (i & 8) == 0) {
                z = true;
            }
        }
        if (z) {
            if ((uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.b & 256) != 0) {
                aragVar = uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.i;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            p(ajgl.b(aragVar).toString(), new wat("UploadUrl or ExternalChannelId was not set."));
            return;
        }
        String str = uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.e;
        this.ak = (uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.b & 8) != 0 ? uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.f : "";
        this.c.execute(new waw(this, str, uploadPhotoEndpointOuterClass$UploadPhotoEndpoint));
    }

    public final void s(int i) {
        arag aragVar;
        aauj aaujVar = this.e;
        String str = this.ak;
        String str2 = this.al;
        aaud aaudVar = new aaud(aaujVar.e, aaujVar.a);
        ((aaue) aaudVar).c = str;
        aaudVar.a = str2;
        aaudVar.b = i;
        try {
            this.e.a(aaudVar).get();
            aG();
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint = this.ar;
            if ((uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.b & 256) != 0) {
                aragVar = uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.i;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            p(ajgl.b(aragVar).toString(), new wat(e));
        }
    }

    public final void q() {
        UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint = this.ar;
        int i = uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.c;
        if (i == 3) {
            this.ae.a((apzg) uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.d);
        } else if (i != 2) {
            aG();
        } else {
            this.ae.a((apzg) uploadPhotoEndpointOuterClass$UploadPhotoEndpoint.d);
        }
    }

    @Override // defpackage.dp
    public final void S(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i != 1) {
                if (i == 2) {
                    this.au = true;
                    aI();
                    return;
                }
                p(rh().getString(R.string.image_upload_something_went_wrong), new wat("Unknown activity request code"));
                return;
            }
            Uri uri = this.as;
            if (uri == null) {
                uri = intent.getData();
            }
            this.as = uri;
            if (uri == null) {
                p(rh().getString(R.string.image_upload_something_went_wrong), new wat("Failed to get image uri"));
                return;
            }
            this.at = true;
            aF();
        } else if (i2 == 0) {
            aH();
        } else if (i != 2 || i2 != 2) {
            p(rh().getString(R.string.image_upload_something_went_wrong), new wat("Unknown activity result code"));
        } else {
            ardn ardnVar = this.aq.e;
            if (ardnVar == null) {
                ardnVar = ardn.a;
            }
            int i3 = ardnVar.e;
            ardn ardnVar2 = this.aq.e;
            if (ardnVar2 == null) {
                ardnVar2 = ardn.a;
            }
            int i4 = ardnVar2.f;
            String string = rh().getString(R.string.crop_image_too_small, Integer.valueOf(i3), Integer.valueOf(i4));
            StringBuilder sb = new StringBuilder(69);
            sb.append("Selected image is too small. Must be at least ");
            sb.append(i3);
            sb.append("x");
            sb.append(i4);
            p(string, new wat(sb.toString()));
        }
    }
}
