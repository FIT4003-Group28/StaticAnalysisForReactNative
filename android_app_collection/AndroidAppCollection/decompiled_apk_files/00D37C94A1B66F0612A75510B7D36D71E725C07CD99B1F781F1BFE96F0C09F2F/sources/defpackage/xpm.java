package defpackage;

import android.animation.LayoutTransition;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.opengl.EGL14;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.mediapipe.framework.AndroidAssetUtil;
import com.google.mediapipe.framework.AndroidPacketCreator;
import com.google.mediapipe.framework.Graph;
import com.google.mediapipe.framework.MediaPipeException;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketCreator;
import com.google.protos.youtube.api.innertube.BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: xpm  reason: default package */
/* loaded from: classes4.dex */
public final class xpm extends xpc {
    private static final xpa[] ah = {new xpa("Normal", "NORMAL"), new xpa("Sketch", "SKETCH_IMAGE_FILTER"), new xpa("Sepia", "SEPIA_IMAGE_FILTER")};
    public Executor a;
    public String ae;
    public ImageView af;
    public Bitmap ag;
    private Uri ai;
    public xrw b;
    public afts c;
    public xps d;
    public String e;

    public static xpm o(BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint, Uri uri) {
        backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.getClass();
        xpm xpmVar = new xpm();
        Bundle bundle = new Bundle();
        aphq.m(bundle, "image_upload_endpoint", backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint);
        bundle.putParcelable("image_uri", uri);
        xpmVar.ae(bundle);
        return xpmVar;
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        Bundle bundle2 = this.m;
        bundle2.getClass();
        try {
            BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint = (BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint) aphq.i(bundle2, "image_upload_endpoint", BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.a, aoos.b());
            this.e = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.c;
            this.ae = backstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.d;
            Uri uri = (Uri) bundle2.getParcelable("image_uri");
            uri.getClass();
            this.ai = uri;
        } catch (aopx e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.dp
    public final void mR() {
        super.mR();
        xpp xppVar = this.d.e;
        try {
            xppVar.b.d();
        } catch (MediaPipeException unused) {
        }
        try {
            xppVar.b.j();
        } catch (MediaPipeException unused2) {
        }
        xppVar.b.i();
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.image_edit_fragment, viewGroup, false);
        this.af = (ImageView) inflate.findViewById(R.id.preview_image);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        toolbar.l(R.menu.image_edit_action_menu);
        toolbar.q = new xpl(this);
        toolbar.r(new View.OnClickListener() { // from class: xph
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xpm.this.mJ().onBackPressed();
            }
        });
        toolbar.g().findItem(R.id.done_button).setTitle(N(R.string.done));
        final Uri uri = this.ai;
        this.a.execute(new Runnable() { // from class: xpj
            @Override // java.lang.Runnable
            public final void run() {
                Bitmap bitmap;
                int i;
                final xpm xpmVar = xpm.this;
                Object obj = null;
                try {
                    obj = (Drawable) xpmVar.c.b(anek.c(xpmVar.rb().getContentResolver().openInputStream(uri)));
                } catch (FileNotFoundException unused) {
                    zep.b("Failed to find image");
                    xpmVar.mJ().onBackPressed();
                } catch (IOException unused2) {
                    zep.b("Failed to load image");
                    xpmVar.mJ().onBackPressed();
                } catch (zhy unused3) {
                    zep.b("Failed to convert image");
                    xpmVar.mJ().onBackPressed();
                }
                if (!(obj instanceof BitmapDrawable)) {
                    xpmVar.mJ().onBackPressed();
                }
                Bitmap bitmap2 = ((BitmapDrawable) obj).getBitmap();
                int width = bitmap2.getWidth();
                if (width <= 4 || (i = width & 3) == 0) {
                    bitmap = bitmap2;
                } else {
                    int i2 = i >> 1;
                    bitmap = Bitmap.createBitmap(bitmap2, i2, 0, (width - ((int) Math.ceil(i / 2.0f))) - i2, bitmap2.getHeight());
                }
                xpmVar.ag = bitmap;
                if (bitmap2 != xpmVar.ag) {
                    bitmap2.recycle();
                }
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: xpi
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        xpm xpmVar2 = xpm.this;
                        xpmVar2.af.setImageBitmap(xpmVar2.ag);
                        xps xpsVar = xpmVar2.d;
                        Bitmap bitmap3 = xpmVar2.ag;
                        xpp xppVar = xpsVar.e;
                        PacketCreator packetCreator = new PacketCreator(xppVar.b);
                        afw afwVar = new afw();
                        String b = aoif.a().b("kazoo/frame_blurred.png");
                        if (b == null || !b.endsWith("frame_blurred.png")) {
                            zep.b("Failed to get asset_base for: frame_blurred.png");
                            str = "";
                        } else {
                            str = b.substring(0, b.length() - 17);
                        }
                        afwVar.put("asset_base", packetCreator.b(str));
                        aoif.a().d();
                        try {
                            xppVar.b.f(afwVar);
                        } catch (MediaPipeException unused4) {
                        }
                        try {
                            xppVar.b.k(EGL14.eglGetCurrentContext().getNativeHandle());
                            xppVar.b.h();
                        } catch (MediaPipeException unused5) {
                        }
                        xpp xppVar2 = xpsVar.e;
                        xpa[] xpaVarArr = xpsVar.d;
                        AndroidPacketCreator androidPacketCreator = new AndroidPacketCreator(xppVar2.b);
                        if (bitmap3.getConfig() != Bitmap.Config.ARGB_8888) {
                            throw new RuntimeException("bitmap must use ARGB_8888 config.");
                        }
                        Packet create = Packet.create(androidPacketCreator.nativeCreateRgbaImageFrame(androidPacketCreator.a.a(), bitmap3));
                        try {
                            xppVar2.b.c("video_input", create, 0L);
                        } catch (MediaPipeException unused6) {
                            zep.l("addGpuPacket: image input return false");
                        }
                        create.release();
                        ArrayList arrayList = new ArrayList();
                        int length = xpaVarArr.length;
                        for (int i3 = 0; i3 < 3; i3++) {
                            xpa xpaVar = xpaVarArr[i3];
                            aopa createBuilder = axcl.a.createBuilder();
                            String str2 = xpaVar.b;
                            createBuilder.copyOnWrite();
                            axcl axclVar = (axcl) createBuilder.instance;
                            axclVar.b |= 1;
                            axclVar.c = str2;
                            createBuilder.copyOnWrite();
                            axcl axclVar2 = (axcl) createBuilder.instance;
                            axclVar2.d = 1;
                            axclVar2.b |= 2;
                            arrayList.add((axcl) createBuilder.mo39build());
                        }
                        aopa createBuilder2 = axcm.a.createBuilder();
                        createBuilder2.bB(arrayList);
                        Packet b2 = androidPacketCreator.b(new String(((axcm) createBuilder2.mo39build()).toByteArray(), Charset.forName("UTF-8")));
                        try {
                            xppVar2.b.c("runtime_control", b2, 0L);
                        } catch (MediaPipeException unused7) {
                            zep.l("addGpuPacket: runtime control input return false");
                        }
                        b2.release();
                    }
                });
            }
        });
        xps xpsVar = this.d;
        xpa[] xpaVarArr = ah;
        ImageView imageView = this.af;
        xpsVar.d = xpaVarArr;
        xpsVar.c = (LinearLayout) inflate.findViewById(R.id.image_filter_layout);
        xpsVar.b = 0;
        xpp xppVar = xpsVar.e;
        xppVar.b = new Graph();
        aoif.c(xppVar.a);
        AndroidAssetUtil.a(xppVar.a);
        try {
            Graph graph = xppVar.b;
            try {
                InputStream open = xppVar.a.getAssets().open("image_preview_supergraph.binarypb");
                byte[] c = anek.c(open);
                open.close();
                graph.e(c);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (MediaPipeException unused) {
        }
        int i = 0;
        while (true) {
            xpa[] xpaVarArr2 = xpsVar.d;
            int length = xpaVarArr2.length;
            if (i < 3) {
                xpa xpaVar = xpaVarArr2[i];
                ViewGroup viewGroup2 = xpsVar.c;
                View inflate2 = LayoutInflater.from(xpsVar.a).inflate(R.layout.image_filter_list_item, viewGroup2, false);
                LayoutTransition layoutTransition = new LayoutTransition();
                layoutTransition.enableTransitionType(4);
                ((ViewGroup) inflate2).setLayoutTransition(layoutTransition);
                ((TextView) inflate2.findViewById(R.id.filter_text)).setText(xpaVar.a);
                ImageView imageView2 = (ImageView) inflate2.findViewById(R.id.filter_thumbnail);
                imageView2.setImageDrawable(new ColorDrawable(-16777216));
                int childCount = viewGroup2.getChildCount();
                inflate2.setOnClickListener(new xpq(xpsVar, childCount, imageView));
                xpp xppVar2 = xpsVar.e;
                xpr xprVar = new xpr(xpsVar, imageView2, childCount, imageView);
                String str = true != xpaVar.a.equals("Normal") ? "_image_filter_preview" : "_preview";
                String lowerCase = xpaVar.a.toLowerCase(Locale.US);
                StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 7 + str.length());
                sb.append("render_");
                sb.append(lowerCase);
                sb.append(str);
                xppVar2.b.b(sb.toString(), new xpo(xprVar));
                viewGroup2.addView(inflate2);
                i++;
            } else {
                xpsVar.a();
                return inflate;
            }
        }
    }
}
