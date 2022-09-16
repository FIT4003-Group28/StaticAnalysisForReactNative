package defpackage;

import com.google.android.libraries.elements.interfaces.JSCommandResolver;
import com.google.android.libraries.elements.interfaces.JSPromiseResolver;
import io.grpc.Status;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: szn  reason: default package */
/* loaded from: classes4.dex */
public final class szn extends JSCommandResolver {
    private final tcu a;
    private final tcs b;

    public szn(tcu tcuVar, tcs tcsVar) {
        this.a = tcuVar;
        this.b = tcsVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.JSCommandResolver
    public final Status resolve(byte[] bArr) {
        AtomicReference atomicReference = new AtomicReference(Status.k);
        try {
            this.a.d((awmt) aopi.parseFrom(awmt.a, bArr, aoos.b()), this.b, 1).U(new szl(atomicReference));
            return (Status) atomicReference.get();
        } catch (aopx e) {
            throw new ted("Failed to parse command.", e);
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.JSCommandResolver
    public final void resolveAsync(byte[] bArr, JSPromiseResolver jSPromiseResolver) {
        if (jSPromiseResolver == null) {
            throw new ted("Failed to resolve command due to null JSPromiseResolver.");
        }
        try {
            this.a.d((awmt) aopi.parseFrom(awmt.a, bArr, aoos.b()), this.b, 1).U(new szm(jSPromiseResolver));
        } catch (aopx e) {
            throw new ted("Failed to parse command.", e);
        }
    }
}
