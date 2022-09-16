package defpackage;

import com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate;
import com.google.android.libraries.elements.interfaces.ValidationResult;
import io.grpc.Status;
/* compiled from: PG */
/* renamed from: ajjp  reason: default package */
/* loaded from: classes.dex */
public final class ajjp extends ResourceLoaderDelegate {
    private final ajiq a;
    private final teb b;

    public ajjp(ajiq ajiqVar, teb tebVar) {
        this.a = ajiqVar;
        this.b = tebVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public final void onAttemptedToCacheResource(String str, ValidationResult validationResult, Status status) {
        ValidationResult validationResult2 = ValidationResult.UNKNOWN;
        int ordinal = validationResult.ordinal();
        if (ordinal == 0) {
            teb tebVar = this.b;
            String valueOf = String.valueOf(str);
            tebVar.b(32, valueOf.length() != 0 ? "ELMCache: Error caching resource due to unknown reason: ".concat(valueOf) : new String("ELMCache: Error caching resource due to unknown reason: "));
        } else if (ordinal != 2) {
        } else {
            teb tebVar2 = this.b;
            String name = status.getCode().name();
            String description = status.getDescription();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 67 + String.valueOf(name).length() + String.valueOf(description).length());
            sb.append("ELMCache: Error caching resource due to failure: ");
            sb.append(str);
            sb.append(". Error details: ");
            sb.append(name);
            sb.append(" ");
            sb.append(description);
            tebVar2.b(32, sb.toString());
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public final void onMissingCacheDependency(String str) {
        teb tebVar = this.b;
        String valueOf = String.valueOf(str);
        tebVar.b(32, valueOf.length() != 0 ? "ELMCache: The following resource is missing during caching: ".concat(valueOf) : new String("ELMCache: The following resource is missing during caching: "));
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public final void onResourceCachePrepared(String str, Status status) {
        if (!status.f()) {
            teb tebVar = this.b;
            String name = status.getCode().name();
            String description = status.getDescription();
            int length = String.valueOf(str).length();
            StringBuilder sb = new StringBuilder(length + 66 + String.valueOf(name).length() + String.valueOf(description).length());
            sb.append("ELMCache: Error preparing resource for caching: ");
            sb.append(str);
            sb.append(". Error details: ");
            sb.append(name);
            sb.append(" ");
            sb.append(description);
            tebVar.b(32, sb.toString());
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public final void onResourceProcessed(String str, ValidationResult validationResult, Status status) {
        aynr f;
        ValidationResult validationResult2 = ValidationResult.UNKNOWN;
        int ordinal = validationResult.ordinal();
        if (ordinal == 0) {
            teb tebVar = this.b;
            String valueOf = String.valueOf(str);
            tebVar.b(32, valueOf.length() != 0 ? "Error loading resource due to unknown reason: ".concat(valueOf) : new String("Error loading resource due to unknown reason: "));
        } else if (ordinal == 1) {
            this.a.f.add(str);
            final ajiq ajiqVar = this.a;
            if (!ajiqVar.d() || !ajiqVar.e()) {
                f = aynr.f();
            } else {
                f = aynr.t(new aypv() { // from class: ajio
                    @Override // defpackage.aypv
                    public final void a() {
                        ajiq.this.c().cacheResources();
                    }
                });
            }
            f.E(azpj.a()).Q();
        } else if (ordinal != 2) {
        } else {
            teb tebVar2 = this.b;
            String name = status.getCode().name();
            String description = status.getDescription();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 57 + String.valueOf(name).length() + String.valueOf(description).length());
            sb.append("Error loading resource due to failure: ");
            sb.append(str);
            sb.append(". Error details: ");
            sb.append(name);
            sb.append(" ");
            sb.append(description);
            tebVar2.b(32, sb.toString());
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public final void onServingContextUpdated(byte[] bArr) {
        this.a.g.set(aoob.x(bArr));
    }
}
