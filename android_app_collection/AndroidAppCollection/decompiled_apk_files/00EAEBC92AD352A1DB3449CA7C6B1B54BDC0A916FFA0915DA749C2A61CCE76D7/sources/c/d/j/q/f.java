package c.d.j.q;
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f3660a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3661b;

    /* renamed from: c  reason: collision with root package name */
    private final d f3662c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f3663d;

    public f(int i, boolean z, d dVar, Integer num) {
        this.f3660a = i;
        this.f3661b = z;
        this.f3662c = dVar;
        this.f3663d = num;
    }

    private c a(c.d.i.c cVar, boolean z) {
        d dVar = this.f3662c;
        if (dVar == null) {
            return null;
        }
        return dVar.createImageTranscoder(cVar, z);
    }

    private c b(c.d.i.c cVar, boolean z) {
        Integer num = this.f3663d;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return c(cVar, z);
        }
        if (intValue != 1) {
            throw new IllegalArgumentException("Invalid ImageTranscoderType");
        }
        return d(cVar, z);
    }

    private c c(c.d.i.c cVar, boolean z) {
        return com.facebook.imagepipeline.nativecode.c.a(this.f3660a, this.f3661b).createImageTranscoder(cVar, z);
    }

    private c d(c.d.i.c cVar, boolean z) {
        return new h(this.f3660a).createImageTranscoder(cVar, z);
    }

    @Override // c.d.j.q.d
    public c createImageTranscoder(c.d.i.c cVar, boolean z) {
        c a2 = a(cVar, z);
        if (a2 == null) {
            a2 = b(cVar, z);
        }
        if (a2 == null) {
            a2 = c(cVar, z);
        }
        return a2 == null ? d(cVar, z) : a2;
    }
}
