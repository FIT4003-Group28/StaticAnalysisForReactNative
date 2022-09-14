package com.google.android.gms.tagmanager;
/* loaded from: classes.dex */
final class zzgi extends Number implements Comparable<zzgi> {
    private double zzbcz;
    private long zzbda;
    private boolean zzbdb = false;

    private zzgi(double d2) {
        this.zzbcz = d2;
    }

    private zzgi(long j) {
        this.zzbda = j;
    }

    public static zzgi zza(Double d2) {
        return new zzgi(d2.doubleValue());
    }

    public static zzgi zzaj(long j) {
        return new zzgi(j);
    }

    public static zzgi zzdo(String str) {
        try {
            try {
                return new zzgi(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                throw new NumberFormatException(String.valueOf(str).concat(" is not a valid TypedNumber"));
            }
        } catch (NumberFormatException unused2) {
            return new zzgi(Double.parseDouble(str));
        }
    }

    @Override // java.lang.Number
    public final byte byteValue() {
        return (byte) longValue();
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return this.zzbdb ? this.zzbda : this.zzbcz;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzgi) && compareTo((zzgi) obj) == 0;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return (float) doubleValue();
    }

    public final int hashCode() {
        return new Long(longValue()).hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) longValue();
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.zzbdb ? this.zzbda : (long) this.zzbcz;
    }

    @Override // java.lang.Number
    public final short shortValue() {
        return (short) longValue();
    }

    public final String toString() {
        return this.zzbdb ? Long.toString(this.zzbda) : Double.toString(this.zzbcz);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzgi zzgiVar) {
        return (!this.zzbdb || !zzgiVar.zzbdb) ? Double.compare(doubleValue(), zzgiVar.doubleValue()) : new Long(this.zzbda).compareTo(Long.valueOf(zzgiVar.zzbda));
    }

    public final boolean zzpb() {
        return !this.zzbdb;
    }

    public final boolean zzpc() {
        return this.zzbdb;
    }
}
