package com.google.android.gms.internal.measurement;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import org.spongycastle.asn1.eac.CertificateBody;
/* loaded from: classes.dex */
public final class zzaby {
    private final ByteBuffer zzbxf;

    private zzaby(ByteBuffer byteBuffer) {
        this.zzbxf = byteBuffer;
        this.zzbxf.order(ByteOrder.LITTLE_ENDIAN);
    }

    private zzaby(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    private static int zza(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 < length) {
            StringBuilder sb2 = new StringBuilder(54);
            sb2.append("UTF-8 length does not fit in int: ");
            sb2.append(i3 + 4294967296L);
            throw new IllegalArgumentException(sb2.toString());
        }
        return i3;
    }

    private static void zza(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int i2;
        char charAt;
        int i3;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        int i4 = 0;
        if (!byteBuffer.hasArray()) {
            int length = charSequence.length();
            while (i4 < length) {
                char charAt2 = charSequence.charAt(i4);
                char c2 = charAt2;
                if (charAt2 >= 128) {
                    if (charAt2 < 2048) {
                        i3 = (charAt2 >>> 6) | 960;
                    } else if (charAt2 >= 55296 && 57343 >= charAt2) {
                        int i5 = i4 + 1;
                        if (i5 != charSequence.length()) {
                            char charAt3 = charSequence.charAt(i5);
                            if (!Character.isSurrogatePair(charAt2, charAt3)) {
                                i4 = i5;
                            } else {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                                byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                                byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                                byteBuffer.put((byte) ((codePoint & 63) | 128));
                                i4 = i5;
                                i4++;
                            }
                        }
                        StringBuilder sb = new StringBuilder(39);
                        sb.append("Unpaired surrogate at index ");
                        sb.append(i4 - 1);
                        throw new IllegalArgumentException(sb.toString());
                    } else {
                        byteBuffer.put((byte) ((charAt2 >>> '\f') | 480));
                        i3 = ((charAt2 >>> 6) & 63) | 128;
                    }
                    byteBuffer.put((byte) i3);
                    c2 = (charAt2 & '?') | 128;
                }
                byteBuffer.put((byte) c2);
                i4++;
            }
            return;
        }
        try {
            byte[] array = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            int remaining = byteBuffer.remaining();
            int length2 = charSequence.length();
            int i6 = remaining + arrayOffset;
            while (i4 < length2) {
                int i7 = i4 + arrayOffset;
                if (i7 >= i6 || (charAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                array[i7] = (byte) charAt;
                i4++;
            }
            if (i4 == length2) {
                i = arrayOffset + length2;
            } else {
                i = arrayOffset + i4;
                while (i4 < length2) {
                    char charAt4 = charSequence.charAt(i4);
                    if (charAt4 >= 128 || i >= i6) {
                        if (charAt4 < 2048 && i <= i6 - 2) {
                            int i8 = i + 1;
                            array[i] = (byte) ((charAt4 >>> 6) | 960);
                            i = i8 + 1;
                            array[i8] = (byte) ((charAt4 & '?') | 128);
                        } else if ((charAt4 >= 55296 && 57343 >= charAt4) || i > i6 - 3) {
                            if (i > i6 - 4) {
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(charAt4);
                                sb2.append(" at index ");
                                sb2.append(i);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            int i9 = i4 + 1;
                            if (i9 != charSequence.length()) {
                                char charAt5 = charSequence.charAt(i9);
                                if (!Character.isSurrogatePair(charAt4, charAt5)) {
                                    i4 = i9;
                                } else {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    int i10 = i + 1;
                                    array[i] = (byte) ((codePoint2 >>> 18) | 240);
                                    int i11 = i10 + 1;
                                    array[i10] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                    int i12 = i11 + 1;
                                    array[i11] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                    i = i12 + 1;
                                    array[i12] = (byte) ((codePoint2 & 63) | 128);
                                    i4 = i9;
                                }
                            }
                            StringBuilder sb3 = new StringBuilder(39);
                            sb3.append("Unpaired surrogate at index ");
                            sb3.append(i4 - 1);
                            throw new IllegalArgumentException(sb3.toString());
                        } else {
                            int i13 = i + 1;
                            array[i] = (byte) ((charAt4 >>> '\f') | 480);
                            int i14 = i13 + 1;
                            array[i13] = (byte) (((charAt4 >>> 6) & 63) | 128);
                            i2 = i14 + 1;
                            array[i14] = (byte) ((charAt4 & '?') | 128);
                        }
                        i4++;
                    } else {
                        i2 = i + 1;
                        array[i] = (byte) charAt4;
                    }
                    i = i2;
                    i4++;
                }
            }
            byteBuffer.position(i - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e);
            throw bufferOverflowException;
        }
    }

    private final void zzan(long j) {
        while (((-128) & j) != 0) {
            zzap((((int) j) & CertificateBody.profileType) | 128);
            j >>>= 7;
        }
        zzap((int) j);
    }

    public static int zzao(int i) {
        if (i >= 0) {
            return zzas(i);
        }
        return 10;
    }

    public static int zzao(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    private final void zzap(int i) {
        byte b2 = (byte) i;
        if (!this.zzbxf.hasRemaining()) {
            throw new zzabz(this.zzbxf.position(), this.zzbxf.limit());
        }
        this.zzbxf.put(b2);
    }

    public static int zzaq(int i) {
        return zzas(i << 3);
    }

    public static int zzas(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzb(int i, zzacg zzacgVar) {
        int zzaq = zzaq(i);
        int zzvv = zzacgVar.zzvv();
        return zzaq + zzas(zzvv) + zzvv;
    }

    public static zzaby zzb(byte[] bArr, int i, int i2) {
        return new zzaby(bArr, 0, i2);
    }

    public static int zzc(int i, long j) {
        return zzaq(i) + zzao(j);
    }

    public static int zzc(int i, String str) {
        return zzaq(i) + zzfk(str);
    }

    public static int zzf(int i, int i2) {
        return zzaq(i) + zzao(i2);
    }

    public static int zzfk(String str) {
        int zza = zza(str);
        return zzas(zza) + zza;
    }

    public static zzaby zzj(byte[] bArr) {
        return zzb(bArr, 0, bArr.length);
    }

    public final void zza(int i, double d2) {
        zzg(i, 1);
        long doubleToLongBits = Double.doubleToLongBits(d2);
        if (this.zzbxf.remaining() < 8) {
            throw new zzabz(this.zzbxf.position(), this.zzbxf.limit());
        }
        this.zzbxf.putLong(doubleToLongBits);
    }

    public final void zza(int i, float f) {
        zzg(i, 5);
        int floatToIntBits = Float.floatToIntBits(f);
        if (this.zzbxf.remaining() < 4) {
            throw new zzabz(this.zzbxf.position(), this.zzbxf.limit());
        }
        this.zzbxf.putInt(floatToIntBits);
    }

    public final void zza(int i, long j) {
        zzg(i, 0);
        zzan(j);
    }

    public final void zza(int i, zzacg zzacgVar) {
        zzg(i, 2);
        zzb(zzacgVar);
    }

    public final void zza(int i, boolean z) {
        zzg(i, 0);
        byte b2 = z ? (byte) 1 : (byte) 0;
        if (!this.zzbxf.hasRemaining()) {
            throw new zzabz(this.zzbxf.position(), this.zzbxf.limit());
        }
        this.zzbxf.put(b2);
    }

    public final void zzar(int i) {
        while ((i & (-128)) != 0) {
            zzap((i & CertificateBody.profileType) | 128);
            i >>>= 7;
        }
        zzap(i);
    }

    public final void zzb(int i, long j) {
        zzg(i, 0);
        zzan(j);
    }

    public final void zzb(int i, String str) {
        zzg(i, 2);
        try {
            int zzas = zzas(str.length());
            if (zzas != zzas(str.length() * 3)) {
                zzar(zza(str));
                zza(str, this.zzbxf);
                return;
            }
            int position = this.zzbxf.position();
            if (this.zzbxf.remaining() < zzas) {
                throw new zzabz(position + zzas, this.zzbxf.limit());
            }
            this.zzbxf.position(position + zzas);
            zza(str, this.zzbxf);
            int position2 = this.zzbxf.position();
            this.zzbxf.position(position);
            zzar((position2 - position) - zzas);
            this.zzbxf.position(position2);
        } catch (BufferOverflowException e) {
            zzabz zzabzVar = new zzabz(this.zzbxf.position(), this.zzbxf.limit());
            zzabzVar.initCause(e);
            throw zzabzVar;
        }
    }

    public final void zzb(zzacg zzacgVar) {
        zzar(zzacgVar.zzvu());
        zzacgVar.zza(this);
    }

    public final void zze(int i, int i2) {
        zzg(i, 0);
        if (i2 >= 0) {
            zzar(i2);
        } else {
            zzan(i2);
        }
    }

    public final void zzg(int i, int i2) {
        zzar((i << 3) | i2);
    }

    public final void zzk(byte[] bArr) {
        int length = bArr.length;
        if (this.zzbxf.remaining() >= length) {
            this.zzbxf.put(bArr, 0, length);
            return;
        }
        throw new zzabz(this.zzbxf.position(), this.zzbxf.limit());
    }

    public final void zzvn() {
        if (this.zzbxf.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", Integer.valueOf(this.zzbxf.remaining())));
        }
    }
}
