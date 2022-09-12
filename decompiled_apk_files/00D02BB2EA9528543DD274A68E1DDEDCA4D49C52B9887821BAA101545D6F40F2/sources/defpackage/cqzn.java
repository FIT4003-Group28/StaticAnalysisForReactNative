package defpackage;

import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.geller.portable.callbacks.GellerStorageOperationsCallback;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: PG */
/* renamed from: cqzn  reason: default package */
/* loaded from: classes5.dex */
public final class cqzn implements GellerStorageOperationsCallback {
    public final Geller a;
    private final dehp b;

    public cqzn(Geller geller, dehp dehpVar) {
        this.a = geller;
        this.b = dehpVar;
    }

    @Override // com.google.android.libraries.geller.portable.callbacks.GellerStorageOperationsCallback
    public final void onDeletion(final String str, final byte[] bArr) {
        try {
            this.b.a(dazv.b(new Runnable(this, str, bArr) { // from class: cqzm
                private final cqzn a;
                private final String b;
                private final byte[] c;

                {
                    this.a = this;
                    this.b = str;
                    this.c = bArr;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cqzn cqznVar = this.a;
                    String str2 = this.b;
                    byte[] bArr2 = this.c;
                    Geller geller = cqznVar.a;
                    try {
                        geller.nativePropagateDeletion(geller.c, geller.b(str2), bArr2);
                    } catch (cqzl unused) {
                    }
                }
            }));
        } catch (RejectedExecutionException unused) {
        }
    }
}
