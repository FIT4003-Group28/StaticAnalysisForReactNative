package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.DeleteFileRequest;
import com.google.android.gms.mobstore.OpenFileDescriptorRequest;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;
import com.google.android.gms.mobstore.RenameRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: rrm  reason: default package */
/* loaded from: classes4.dex */
public final class rrm implements vkm {
    public final qst a;
    private final vjs b;

    public rrm(Context context) {
        vjs vjsVar = new vjs();
        this.a = rrq.a(context.getApplicationContext());
        this.b = vjsVar;
    }

    private final ParcelFileDescriptor o(final Uri uri, final int i) {
        return (ParcelFileDescriptor) p("open file", new Callable() { // from class: rri
            @Override // java.util.concurrent.Callable
            public final Object call() {
                rrm rrmVar = rrm.this;
                Uri uri2 = uri;
                int i2 = i;
                qst qstVar = rrmVar.a;
                final OpenFileDescriptorRequest openFileDescriptorRequest = new OpenFileDescriptorRequest(uri2, i2);
                qvx b = qvy.b();
                b.a = new qvo() { // from class: rrs
                    @Override // defpackage.qvo
                    public final void a(Object obj, Object obj2) {
                        OpenFileDescriptorRequest openFileDescriptorRequest2 = OpenFileDescriptorRequest.this;
                        rrx rrxVar = (rrx) obj;
                        rvh rvhVar = (rvh) obj2;
                        rru rruVar = new rru(rvhVar);
                        try {
                            rro rroVar = (rro) rrxVar.D();
                            Parcel pv = rroVar.pv();
                            dve.i(pv, rruVar);
                            dve.g(pv, openFileDescriptorRequest2);
                            rroVar.px(1, pv);
                        } catch (RemoteException unused) {
                            tgo.l(Status.c, null, rvhVar);
                        }
                    }
                };
                b.b = i2 == 1 ? new Feature[]{rey.f} : null;
                b.c = 7801;
                return ((OpenFileDescriptorResponse) rwd.d(qstVar.s(b.a()))).a;
            }
        });
    }

    private static final Object p(String str, Callable callable) {
        try {
            return callable.call();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException(str.length() != 0 ? "Unable to ".concat(str) : new String("Unable to "), e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof qsp) {
                qsp qspVar = (qsp) cause;
                String str2 = qspVar.a.h;
                if (qspVar.a() == 33500) {
                    StringBuilder sb = new StringBuilder(str.length() + 19 + String.valueOf(str2).length());
                    sb.append("Unable to ");
                    sb.append(str);
                    sb.append(" because ");
                    sb.append(str2);
                    throw new FileNotFoundException(sb.toString());
                } else if (qspVar.a() == 10 && !TextUtils.isEmpty(str2) && str2.startsWith("File not found:")) {
                    StringBuilder sb2 = new StringBuilder(str.length() + 19 + String.valueOf(str2).length());
                    sb2.append("Unable to ");
                    sb2.append(str);
                    sb2.append(" because ");
                    sb2.append(str2);
                    throw new FileNotFoundException(sb2.toString());
                }
            }
            throw new IOException(str.length() != 0 ? "Unable to ".concat(str) : new String("Unable to "), e2);
        } catch (Exception e3) {
            throw new IOException(str.length() != 0 ? "Unable to ".concat(str) : new String("Unable to "), e3);
        }
    }

    @Override // defpackage.vkm
    public final /* synthetic */ long a(Uri uri) {
        throw new vjw("fileSize not supported by android");
    }

    @Override // defpackage.vkm
    public final vjs b() {
        return this.b;
    }

    @Override // defpackage.vkm
    public final /* synthetic */ File c(Uri uri) {
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
        sb.append("Cannot convert uri to file android ");
        sb.append(valueOf);
        throw new vjw(sb.toString());
    }

    @Override // defpackage.vkm
    public final InputStream d(Uri uri) {
        return new rrk(o(uri, 0));
    }

    @Override // defpackage.vkm
    public final /* synthetic */ OutputStream e(Uri uri) {
        throw new vjw("openForAppend not supported by android");
    }

    @Override // defpackage.vkm
    public final OutputStream f(Uri uri) {
        return new rrl(o(uri, 1));
    }

    @Override // defpackage.vkm
    public final /* synthetic */ Iterable g(Uri uri) {
        throw new vjw("children not supported by android");
    }

    @Override // defpackage.vkm
    public final String h() {
        return "android";
    }

    @Override // defpackage.vkm
    public final /* synthetic */ void i(Uri uri) {
        throw new vjw("createDirectory not supported by android");
    }

    @Override // defpackage.vkm
    public final /* synthetic */ void j(Uri uri) {
        throw new vjw("deleteDirectory not supported by android");
    }

    @Override // defpackage.vkm
    public final void k(final Uri uri) {
        p("delete file", new Callable() { // from class: rrh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                rrm rrmVar = rrm.this;
                Uri uri2 = uri;
                qst qstVar = rrmVar.a;
                final DeleteFileRequest deleteFileRequest = new DeleteFileRequest(uri2);
                qvx b = qvy.b();
                b.a = new qvo() { // from class: rrr
                    @Override // defpackage.qvo
                    public final void a(Object obj, Object obj2) {
                        DeleteFileRequest deleteFileRequest2 = DeleteFileRequest.this;
                        rrx rrxVar = (rrx) obj;
                        rvh rvhVar = (rvh) obj2;
                        rrv rrvVar = new rrv(rvhVar);
                        try {
                            rro rroVar = (rro) rrxVar.D();
                            Parcel pv = rroVar.pv();
                            dve.i(pv, rrvVar);
                            dve.g(pv, deleteFileRequest2);
                            rroVar.px(2, pv);
                        } catch (RemoteException unused) {
                            tgo.l(Status.c, null, rvhVar);
                        }
                    }
                };
                b.b = new Feature[]{rey.f};
                b.c = 7802;
                return (Void) rwd.d(qstVar.s(b.a()));
            }
        });
    }

    @Override // defpackage.vkm
    public final void l(final Uri uri, final Uri uri2) {
        p("rename file", new Callable() { // from class: rrj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                rrm rrmVar = rrm.this;
                Uri uri3 = uri;
                Uri uri4 = uri2;
                qst qstVar = rrmVar.a;
                final RenameRequest renameRequest = new RenameRequest(uri3, uri4);
                qvx b = qvy.b();
                b.a = new qvo() { // from class: rrt
                    @Override // defpackage.qvo
                    public final void a(Object obj, Object obj2) {
                        RenameRequest renameRequest2 = RenameRequest.this;
                        rrx rrxVar = (rrx) obj;
                        rvh rvhVar = (rvh) obj2;
                        rrw rrwVar = new rrw(rvhVar);
                        try {
                            rro rroVar = (rro) rrxVar.D();
                            Parcel pv = rroVar.pv();
                            dve.i(pv, rrwVar);
                            dve.g(pv, renameRequest2);
                            rroVar.px(3, pv);
                        } catch (RemoteException unused) {
                            tgo.l(Status.c, null, rvhVar);
                        }
                    }
                };
                b.b = new Feature[]{rey.g};
                b.b();
                b.c = 7803;
                return (Void) rwd.d(qstVar.s(b.a()));
            }
        });
    }

    @Override // defpackage.vkm
    public final boolean m(Uri uri) {
        try {
            ParcelFileDescriptor o = o(uri, 0);
            if (o == null) {
                return true;
            }
            o.close();
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    @Override // defpackage.vkm
    public final /* synthetic */ boolean n(Uri uri) {
        throw new vjw("isDirectory not supported by android");
    }
}
