package androidx.lifecycle;

import androidx.lifecycle.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements g {

    /* renamed from: a  reason: collision with root package name */
    private final b f1823a;

    /* renamed from: b  reason: collision with root package name */
    private final g f1824b;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1825a = new int[f.a.values().length];

        static {
            try {
                f1825a[f.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1825a[f.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1825a[f.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1825a[f.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1825a[f.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1825a[f.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1825a[f.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FullLifecycleObserverAdapter(b bVar, g gVar) {
        this.f1823a = bVar;
        this.f1824b = gVar;
    }

    @Override // androidx.lifecycle.g
    public void a(i iVar, f.a aVar) {
        switch (a.f1825a[aVar.ordinal()]) {
            case 1:
                this.f1823a.c(iVar);
                break;
            case 2:
                this.f1823a.e(iVar);
                break;
            case 3:
                this.f1823a.a(iVar);
                break;
            case 4:
                this.f1823a.d(iVar);
                break;
            case 5:
                this.f1823a.f(iVar);
                break;
            case 6:
                this.f1823a.b(iVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        g gVar = this.f1824b;
        if (gVar != null) {
            gVar.a(iVar, aVar);
        }
    }
}
