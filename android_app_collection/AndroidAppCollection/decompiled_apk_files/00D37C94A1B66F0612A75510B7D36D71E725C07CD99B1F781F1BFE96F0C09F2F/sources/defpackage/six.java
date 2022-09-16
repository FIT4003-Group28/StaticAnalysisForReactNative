package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import com.google.research.xeno.effect.AssetDownloader;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: six  reason: default package */
/* loaded from: classes4.dex */
public final class six implements AssetDownloader {
    public final CronetEngine a;
    public final Executor b;
    public final sld c;
    public final HashSet d = new HashSet();

    public six(CronetEngine cronetEngine, Executor executor, Executor executor2) {
        this.a = cronetEngine;
        this.b = executor;
        this.c = new sld(executor2);
    }

    @Override // com.google.research.xeno.effect.AssetDownloader
    public final void downloadAsset(final String str, final AssetDownloader.DownloadCallback downloadCallback) {
        synchronized (this.c) {
            if (this.c.b(new slc() { // from class: siv
                @Override // defpackage.slc
                public final ankt a() {
                    six sixVar = six.this;
                    AssetDownloader.DownloadCallback downloadCallback2 = downloadCallback;
                    final String str2 = str;
                    try {
                        final File createTempFile = File.createTempFile("asset", ".tmp");
                        createTempFile.deleteOnExit();
                        final CronetEngine cronetEngine = sixVar.a;
                        final Executor executor = sixVar.b;
                        ankt c = aed.c(new agr() { // from class: skz
                            @Override // defpackage.agr
                            public final Object a(agp agpVar) {
                                CronetEngine cronetEngine2 = CronetEngine.this;
                                String str3 = str2;
                                File file = createTempFile;
                                cronetEngine2.mo551newUrlRequestBuilder(str3, new sla(agpVar, file), executor).mo565build().start();
                                String absolutePath = file.getAbsolutePath();
                                StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 26 + String.valueOf(str3).length());
                                sb.append("UrlRequest to file: ");
                                sb.append(absolutePath);
                                sb.append(" for: ");
                                sb.append(str3);
                                return sb.toString();
                            }
                        });
                        synchronized (sixVar.c) {
                            sixVar.d.add(c);
                        }
                        SettableFuture f = SettableFuture.f();
                        anlz.A(c, new siw(downloadCallback2, createTempFile, str2, f), sixVar.b);
                        return f;
                    } catch (IOException e) {
                        downloadCallback2.onCompletion(null, e.toString());
                        return anlz.p(e);
                    }
                }
            }).isCancelled()) {
                downloadCallback.onCompletion(null, "Download cancelled.");
            }
        }
    }
}
