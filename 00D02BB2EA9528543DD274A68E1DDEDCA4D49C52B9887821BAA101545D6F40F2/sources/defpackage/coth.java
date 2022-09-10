package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
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
/* renamed from: coth  reason: default package */
/* loaded from: classes5.dex */
public final class coth implements czjl {
    public final cotu a;
    private final cziv b;

    public coth(Context context) {
        cziv czivVar = new cziv();
        this.a = cotm.a(context.getApplicationContext());
        this.b = czivVar;
    }

    private final ParcelFileDescriptor i(final Uri uri, final int i) {
        return (ParcelFileDescriptor) j("open file", new Callable(this, uri, i) { // from class: cote
            private final coth a;
            private final Uri b;
            private final int c;

            {
                this.a = this;
                this.b = uri;
                this.c = i;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                coth cothVar = this.a;
                Uri uri2 = this.b;
                int i2 = this.c;
                cotu cotuVar = cothVar.a;
                OpenFileDescriptorRequest openFileDescriptorRequest = new OpenFileDescriptorRequest(uri2, i2);
                cntc builder = cntd.builder();
                builder.b(new cotq(openFileDescriptorRequest));
                builder.b = i2 == 1 ? new Feature[]{cofc.f} : null;
                return ((OpenFileDescriptorResponse) cpda.d(cotuVar.c(builder.a()))).a;
            }
        });
    }

    private static final <T> T j(String str, Callable<T> callable) {
        try {
            return callable.call();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException(str.length() != 0 ? "Unable to ".concat(str) : new String("Unable to "), e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof cnob) {
                cnob cnobVar = (cnob) cause;
                String str2 = cnobVar.a.h;
                if (cnobVar.a() == 33500) {
                    StringBuilder sb = new StringBuilder(str.length() + 19 + String.valueOf(str2).length());
                    sb.append("Unable to ");
                    sb.append(str);
                    sb.append(" because ");
                    sb.append(str2);
                    throw new FileNotFoundException(sb.toString());
                } else if (cnobVar.a() == 10 && !TextUtils.isEmpty(str2) && str2.startsWith("File not found:")) {
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

    @Override // defpackage.czjl
    public final String a() {
        return "android";
    }

    @Override // defpackage.czjl
    public final boolean b(Uri uri) {
        try {
            ParcelFileDescriptor i = i(uri, 0);
            if (i == null) {
                return true;
            }
            i.close();
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    @Override // defpackage.czjl
    public final InputStream c(Uri uri) {
        return new cotf(i(uri, 0));
    }

    @Override // defpackage.czjl
    public final OutputStream d(Uri uri) {
        return new cotg(i(uri, 1));
    }

    @Override // defpackage.czjl
    public final void e(final Uri uri) {
        j("delete file", new Callable(this, uri) { // from class: cotc
            private final coth a;
            private final Uri b;

            {
                this.a = this;
                this.b = uri;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                coth cothVar = this.a;
                Uri uri2 = this.b;
                cotu cotuVar = cothVar.a;
                DeleteFileRequest deleteFileRequest = new DeleteFileRequest(uri2);
                cntc builder = cntd.builder();
                builder.b(new coto(deleteFileRequest));
                builder.b = new Feature[]{cofc.f};
                return (Void) cpda.d(cotuVar.c(builder.a()));
            }
        });
    }

    @Override // defpackage.czjl
    public final void f(final Uri uri, final Uri uri2) {
        j("rename file", new Callable(this, uri, uri2) { // from class: cotd
            private final coth a;
            private final Uri b;
            private final Uri c;

            {
                this.a = this;
                this.b = uri;
                this.c = uri2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                coth cothVar = this.a;
                Uri uri3 = this.b;
                Uri uri4 = this.c;
                cotu cotuVar = cothVar.a;
                RenameRequest renameRequest = new RenameRequest(uri3, uri4);
                cntc builder = cntd.builder();
                builder.b(new cots(renameRequest));
                builder.b = new Feature[]{cofc.g};
                builder.c();
                return (Void) cpda.d(cotuVar.c(builder.a()));
            }
        });
    }

    @Override // defpackage.czjl
    public final cziv g() {
        return this.b;
    }

    @Override // defpackage.czjl
    public final File h(Uri uri) {
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(35 + String.valueOf(valueOf).length());
        sb.append("Cannot convert uri to file ");
        sb.append("android");
        sb.append(" ");
        sb.append(valueOf);
        throw new cziz(sb.toString());
    }
}
