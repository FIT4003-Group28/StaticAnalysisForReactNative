package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.view.View;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: gzk  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gzk implements View.OnClickListener {
    public final /* synthetic */ gzt a;
    private final /* synthetic */ int b;

    public /* synthetic */ gzk(gzt gztVar) {
        this.a = gztVar;
    }

    public /* synthetic */ gzk(gzt gztVar, int i) {
        this.b = i;
        this.a = gztVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            this.a.aH();
            return;
        }
        gzt gztVar = this.a;
        aopa createBuilder = atnp.a.createBuilder();
        createBuilder.copyOnWrite();
        atnp atnpVar = (atnp) createBuilder.instance;
        atnpVar.b |= 2;
        atnpVar.d = 96644;
        InteractionLoggingScreen interactionLoggingScreen = ((acsx) gztVar.a).i;
        if (interactionLoggingScreen != null) {
            String str = interactionLoggingScreen.a;
            createBuilder.copyOnWrite();
            atnp atnpVar2 = (atnp) createBuilder.instance;
            str.getClass();
            atnpVar2.b |= 1;
            atnpVar2.c = str;
        }
        atnp atnpVar3 = (atnp) createBuilder.mo39build();
        gztVar.ay.setEnabled(false);
        hai haiVar = gztVar.b;
        apy apyVar = haiVar.d;
        final hao haoVar = haiVar.C;
        final Context context = haiVar.j;
        final zqq zqqVar = haiVar.s;
        final Uri uri = haiVar.l;
        if (zqqVar == null) {
            throw new IllegalArgumentException("Effects pipeline cannot be null");
        }
        ylx.n(apyVar, anii.i(anii.i(anko.q(anlz.u(new Callable() { // from class: ham
            @Override // java.util.concurrent.Callable
            public final Object call() {
                hao haoVar2 = hao.this;
                Context context2 = context;
                Uri uri2 = uri;
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                hqp.z(uri2, mediaMetadataRetriever, context2.getContentResolver());
                hhp b = haoVar2.a.b();
                long j = 0;
                if (b != null) {
                    vqr B = b.B();
                    if (hhp.E(b) && B != null) {
                        j = B.n();
                    }
                }
                Bitmap A = hqp.A(j, mediaMetadataRetriever);
                hqp.B(mediaMetadataRetriever);
                return A;
            }
        }, haoVar.c)), new anir() { // from class: hal
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                hao haoVar2 = hao.this;
                final zqq zqqVar2 = zqqVar;
                final Bitmap bitmap = (Bitmap) obj;
                ankx ankxVar = haoVar2.c;
                zqqVar2.t.getClass();
                if (zqqVar2.n || !zqqVar2.o) {
                    throw new IllegalStateException("Effects pipeline is destroyed or it is not running.");
                }
                ankt x = anlz.x(aed.c(new agr() { // from class: zps
                    @Override // defpackage.agr
                    public final Object a(final agp agpVar) {
                        final zqq zqqVar3 = zqq.this;
                        final Bitmap bitmap2 = bitmap;
                        zqqVar3.w(new Runnable() { // from class: zqb
                            @Override // java.lang.Runnable
                            public final void run() {
                                zqq zqqVar4 = zqq.this;
                                Bitmap bitmap3 = bitmap2;
                                final agp agpVar2 = agpVar;
                                zqqVar4.i.m(false);
                                zqqVar4.t.d();
                                zqqVar4.i.k.a(bitmap3);
                                zou zouVar = zqqVar4.i;
                                zdt zdtVar = new zdt() { // from class: zqe
                                    @Override // defpackage.zdt
                                    public final void a(Object obj2) {
                                        agp.this.c((Bitmap) obj2);
                                    }
                                };
                                zoi zoiVar = zouVar.c;
                                zoiVar.e = -1L;
                                zoiVar.d = zdtVar;
                            }
                        });
                        return "GetNextOutputAsBitmap";
                    }
                }), 500L, TimeUnit.MILLISECONDS, ankxVar);
                ylx.k(x, anjk.a, new ylv() { // from class: zqa
                    @Override // defpackage.zdt
                    /* renamed from: b */
                    public final void a(Throwable th) {
                        zqq.this.v();
                    }
                }, new ylw() { // from class: zqd
                    @Override // defpackage.ylw, defpackage.zdt
                    public final void a(Object obj2) {
                        Bitmap bitmap2 = (Bitmap) obj2;
                        zqq.this.v();
                    }
                });
                return x;
            }
        }, haoVar.d), new anir() { // from class: hak
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                final hao haoVar2 = hao.this;
                final Context context2 = context;
                final Bitmap bitmap = (Bitmap) obj;
                return anlz.u(new Callable() { // from class: han
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        hao haoVar3 = hao.this;
                        Bitmap bitmap2 = bitmap;
                        Context context3 = context2;
                        hkg hkgVar = haoVar3.b;
                        if (hkgVar.f) {
                            hkgVar.c("Failure while setting thumbnail.", hkgVar.d.p(hkgVar.e, bitmap2));
                        }
                        File file = new File(hhp.C(context3).getPath(), "Thumbnail");
                        if (file.exists()) {
                            File[] listFiles = file.listFiles();
                            if (listFiles != null) {
                                for (File file2 : listFiles) {
                                    file2.delete();
                                }
                            }
                        } else {
                            file.mkdirs();
                        }
                        File file3 = new File(file, bakj.a("'thumbnailFile'_yyyyMMdd_HHmmssSSS'.jpg'").a(baia.c()));
                        file3.createNewFile();
                        FileOutputStream fileOutputStream = new FileOutputStream(file3);
                        bitmap2.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        fileOutputStream.close();
                        return file3.getAbsolutePath();
                    }
                }, haoVar2.c);
            }
        }, haoVar.c), new had(haiVar, atnpVar3), new had(haiVar, atnpVar3, 1));
    }
}
