package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* renamed from: aoh  reason: default package */
/* loaded from: classes2.dex */
final class aoh {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public aoh(int i, int i2, long j, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public aoh(int i, int i2, byte[] bArr) {
        this(i, i2, -1L, bArr);
    }

    public static aoh a(int i, ByteOrder byteOrder) {
        int[] iArr = {i};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[aok.e[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) iArr[0]);
        return new aoh(3, 1, wrap.array());
    }

    public static aoh b(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[aok.e[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new aoh(4, 1, wrap.array());
    }

    public static aoh c(String str) {
        byte[] bytes = (str + (char) 0).getBytes(aok.h);
        return new aoh(2, bytes.length, bytes);
    }

    public static aoh d(aoj aojVar, ByteOrder byteOrder) {
        aoj[] aojVarArr = {aojVar};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[aok.e[5]]);
        wrap.order(byteOrder);
        aoj aojVar2 = aojVarArr[0];
        wrap.putInt((int) aojVar2.a);
        wrap.putInt((int) aojVar2.b);
        return new aoh(5, 1, wrap.array());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object e(ByteOrder byteOrder) {
        aog aogVar;
        byte b;
        byte b2;
        aog aogVar2 = null;
        try {
            aogVar = new aog(this.d);
            try {
                aogVar.a = byteOrder;
                int i = 0;
                switch (this.a) {
                    case 1:
                    case 6:
                        byte[] bArr = this.d;
                        if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                            String str = new String(bArr, aok.h);
                            try {
                                aogVar.close();
                            } catch (IOException unused) {
                            }
                            return str;
                        }
                        String str2 = new String(new char[]{(char) (b + 48)});
                        try {
                            aogVar.close();
                        } catch (IOException unused2) {
                        }
                        return str2;
                    case 2:
                    case 7:
                        int i2 = this.b;
                        int length = aok.f.length;
                        if (i2 >= 8) {
                            int i3 = 0;
                            while (true) {
                                int length2 = aok.f.length;
                                if (i3 >= 8) {
                                    int length3 = aok.f.length;
                                    i = 8;
                                } else if (this.d[i3] == aok.f[i3]) {
                                    i3++;
                                }
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        while (i < this.b && (b2 = this.d[i]) != 0) {
                            if (b2 >= 32) {
                                sb.append((char) b2);
                            } else {
                                sb.append('?');
                            }
                            i++;
                        }
                        String sb2 = sb.toString();
                        try {
                            aogVar.close();
                        } catch (IOException unused3) {
                        }
                        return sb2;
                    case 3:
                        int[] iArr = new int[this.b];
                        while (i < this.b) {
                            iArr[i] = aogVar.readUnsignedShort();
                            i++;
                        }
                        try {
                            aogVar.close();
                        } catch (IOException unused4) {
                        }
                        return iArr;
                    case 4:
                        long[] jArr = new long[this.b];
                        while (i < this.b) {
                            jArr[i] = aogVar.b();
                            i++;
                        }
                        try {
                            aogVar.close();
                        } catch (IOException unused5) {
                        }
                        return jArr;
                    case 5:
                        aoj[] aojVarArr = new aoj[this.b];
                        while (i < this.b) {
                            aojVarArr[i] = new aoj(aogVar.b(), aogVar.b());
                            i++;
                        }
                        try {
                            aogVar.close();
                        } catch (IOException unused6) {
                        }
                        return aojVarArr;
                    case 8:
                        int[] iArr2 = new int[this.b];
                        while (i < this.b) {
                            iArr2[i] = aogVar.readShort();
                            i++;
                        }
                        try {
                            aogVar.close();
                        } catch (IOException unused7) {
                        }
                        return iArr2;
                    case 9:
                        int[] iArr3 = new int[this.b];
                        while (i < this.b) {
                            iArr3[i] = aogVar.readInt();
                            i++;
                        }
                        try {
                            aogVar.close();
                        } catch (IOException unused8) {
                        }
                        return iArr3;
                    case 10:
                        aoj[] aojVarArr2 = new aoj[this.b];
                        while (i < this.b) {
                            aojVarArr2[i] = new aoj(aogVar.readInt(), aogVar.readInt());
                            i++;
                        }
                        try {
                            aogVar.close();
                        } catch (IOException unused9) {
                        }
                        return aojVarArr2;
                    case 11:
                        double[] dArr = new double[this.b];
                        while (i < this.b) {
                            dArr[i] = aogVar.readFloat();
                            i++;
                        }
                        try {
                            aogVar.close();
                        } catch (IOException unused10) {
                        }
                        return dArr;
                    case 12:
                        double[] dArr2 = new double[this.b];
                        while (i < this.b) {
                            dArr2[i] = aogVar.readDouble();
                            i++;
                        }
                        try {
                            aogVar.close();
                        } catch (IOException unused11) {
                        }
                        return dArr2;
                    default:
                        try {
                            aogVar.close();
                        } catch (IOException unused12) {
                        }
                        return null;
                }
            } catch (IOException unused13) {
                if (aogVar != null) {
                    try {
                        aogVar.close();
                    } catch (IOException unused14) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                aogVar2 = aogVar;
                if (aogVar2 != null) {
                    try {
                        aogVar2.close();
                    } catch (IOException unused15) {
                    }
                }
                throw th;
            }
        } catch (IOException unused16) {
            aogVar = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final int f(ByteOrder byteOrder) {
        Object e = e(byteOrder);
        if (e == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (e instanceof String) {
            return Integer.parseInt((String) e);
        }
        if (e instanceof long[]) {
            long[] jArr = (long[]) e;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        } else if (e instanceof int[]) {
            int[] iArr = (int[]) e;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        } else {
            throw new NumberFormatException("Couldn't find a integer value");
        }
    }

    public final String g(ByteOrder byteOrder) {
        Object e = e(byteOrder);
        if (e == null) {
            return null;
        }
        if (e instanceof String) {
            return (String) e;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (e instanceof long[]) {
            long[] jArr = (long[]) e;
            while (true) {
                int length = jArr.length;
                if (i < length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != length) {
                        sb.append(",");
                    }
                } else {
                    return sb.toString();
                }
            }
        } else if (e instanceof int[]) {
            int[] iArr = (int[]) e;
            while (true) {
                int length2 = iArr.length;
                if (i < length2) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != length2) {
                        sb.append(",");
                    }
                } else {
                    return sb.toString();
                }
            }
        } else if (e instanceof double[]) {
            double[] dArr = (double[]) e;
            while (true) {
                int length3 = dArr.length;
                if (i < length3) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != length3) {
                        sb.append(",");
                    }
                } else {
                    return sb.toString();
                }
            }
        } else if (!(e instanceof aoj[])) {
            return null;
        } else {
            aoj[] aojVarArr = (aoj[]) e;
            while (true) {
                int length4 = aojVarArr.length;
                if (i < length4) {
                    sb.append(aojVarArr[i].a);
                    sb.append('/');
                    sb.append(aojVarArr[i].b);
                    i++;
                    if (i != length4) {
                        sb.append(",");
                    }
                } else {
                    return sb.toString();
                }
            }
        }
    }

    public final String toString() {
        return "(" + aok.d[this.a] + ", data length:" + this.d.length + ")";
    }
}
