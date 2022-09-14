package com.google.android.gms.common.server.response;

import android.util.Log;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
/* loaded from: classes.dex */
public class FastParser<T extends FastJsonResponse> {
    private static final char[] zzwv = {'u', 'l', 'l'};
    private static final char[] zzww = {'r', 'u', 'e'};
    private static final char[] zzwx = {'r', 'u', 'e', '\"'};
    private static final char[] zzwy = {'a', 'l', 's', 'e'};
    private static final char[] zzwz = {'a', 'l', 's', 'e', '\"'};
    private static final char[] zzxa = {'\n'};
    private static final zza<Integer> zzxc = new com.google.android.gms.common.server.response.zza();
    private static final zza<Long> zzxd = new zzb();
    private static final zza<Float> zzxe = new zzc();
    private static final zza<Double> zzxf = new zzd();
    private static final zza<Boolean> zzxg = new zze();
    private static final zza<String> zzxh = new zzf();
    private static final zza<BigInteger> zzxi = new zzg();
    private static final zza<BigDecimal> zzxj = new zzh();
    private final char[] zzwq = new char[1];
    private final char[] zzwr = new char[32];
    private final char[] zzws = new char[1024];
    private final StringBuilder zzwt = new StringBuilder(32);
    private final StringBuilder zzwu = new StringBuilder(1024);
    private final Stack<Integer> zzxb = new Stack<>();

    /* loaded from: classes.dex */
    public static class ParseException extends Exception {
        public ParseException(String str) {
            super(str);
        }

        public ParseException(String str, Throwable th) {
            super(str, th);
        }

        public ParseException(Throwable th) {
            super(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface zza<O> {
        O zzh(FastParser fastParser, BufferedReader bufferedReader);
    }

    private final int zza(BufferedReader bufferedReader, char[] cArr) {
        int i;
        char zzj = zzj(bufferedReader);
        if (zzj == 0) {
            throw new ParseException("Unexpected EOF");
        }
        if (zzj == ',') {
            throw new ParseException("Missing value");
        }
        if (zzj == 'n') {
            zzb(bufferedReader, zzwv);
            return 0;
        }
        bufferedReader.mark(1024);
        if (zzj == '\"') {
            i = 0;
            boolean z = false;
            while (i < cArr.length && bufferedReader.read(cArr, i, 1) != -1) {
                char c2 = cArr[i];
                if (Character.isISOControl(c2)) {
                    throw new ParseException("Unexpected control character while reading string");
                }
                if (c2 == '\"' && !z) {
                    bufferedReader.reset();
                    bufferedReader.skip(i + 1);
                    return i;
                }
                z = c2 == '\\' ? !z : false;
                i++;
            }
        } else {
            cArr[0] = zzj;
            i = 1;
            while (i < cArr.length && bufferedReader.read(cArr, i, 1) != -1) {
                if (cArr[i] == '}' || cArr[i] == ',' || Character.isWhitespace(cArr[i]) || cArr[i] == ']') {
                    bufferedReader.reset();
                    bufferedReader.skip(i - 1);
                    cArr[i] = 0;
                    return i;
                }
                i++;
            }
        }
        if (i != cArr.length) {
            throw new ParseException("Unexpected EOF");
        }
        throw new ParseException("Absurdly long value");
    }

    private final String zza(BufferedReader bufferedReader) {
        this.zzxb.push(2);
        char zzj = zzj(bufferedReader);
        if (zzj == '\"') {
            this.zzxb.push(3);
            String zzb = zzb(bufferedReader, this.zzwr, this.zzwt, null);
            zzk(3);
            if (zzj(bufferedReader) == ':') {
                return zzb;
            }
            throw new ParseException("Expected key/value separator");
        } else if (zzj == ']') {
            zzk(2);
            zzk(1);
            zzk(5);
            return null;
        } else if (zzj == '}') {
            zzk(2);
            return null;
        } else {
            StringBuilder sb = new StringBuilder(19);
            sb.append("Unexpected token: ");
            sb.append(zzj);
            throw new ParseException(sb.toString());
        }
    }

    private final String zza(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, char[] cArr2) {
        char zzj = zzj(bufferedReader);
        if (zzj != '\"') {
            if (zzj != 'n') {
                throw new ParseException("Expected string");
            }
            zzb(bufferedReader, zzwv);
            return null;
        }
        return zzb(bufferedReader, cArr, sb, cArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends FastJsonResponse> ArrayList<T> zza(BufferedReader bufferedReader, FastJsonResponse.Field<?, ?> field) {
        ArrayList<T> arrayList = (ArrayList<T>) new ArrayList();
        char zzj = zzj(bufferedReader);
        if (zzj == ']') {
            zzk(5);
            return arrayList;
        } else if (zzj == 'n') {
            zzb(bufferedReader, zzwv);
            zzk(5);
            return null;
        } else if (zzj != '{') {
            StringBuilder sb = new StringBuilder(19);
            sb.append("Unexpected token: ");
            sb.append(zzj);
            throw new ParseException(sb.toString());
        } else {
            Stack<Integer> stack = this.zzxb;
            while (true) {
                stack.push(1);
                try {
                    FastJsonResponse newConcreteTypeInstance = field.newConcreteTypeInstance();
                    if (!zza(bufferedReader, newConcreteTypeInstance)) {
                        return arrayList;
                    }
                    arrayList.add(newConcreteTypeInstance);
                    char zzj2 = zzj(bufferedReader);
                    if (zzj2 != ',') {
                        if (zzj2 == ']') {
                            zzk(5);
                            return arrayList;
                        }
                        StringBuilder sb2 = new StringBuilder(19);
                        sb2.append("Unexpected token: ");
                        sb2.append(zzj2);
                        throw new ParseException(sb2.toString());
                    } else if (zzj(bufferedReader) != '{') {
                        throw new ParseException("Expected start of next object in array");
                    } else {
                        stack = this.zzxb;
                    }
                } catch (IllegalAccessException e) {
                    throw new ParseException("Error instantiating inner object", e);
                } catch (InstantiationException e2) {
                    throw new ParseException("Error instantiating inner object", e2);
                }
            }
        }
    }

    private final <O> ArrayList<O> zza(BufferedReader bufferedReader, zza<O> zzaVar) {
        char zzj = zzj(bufferedReader);
        if (zzj == 'n') {
            zzb(bufferedReader, zzwv);
            return null;
        } else if (zzj != '[') {
            throw new ParseException("Expected start of array");
        } else {
            this.zzxb.push(5);
            ArrayList<O> arrayList = new ArrayList<>();
            while (true) {
                bufferedReader.mark(1024);
                char zzj2 = zzj(bufferedReader);
                if (zzj2 == 0) {
                    throw new ParseException("Unexpected EOF");
                }
                if (zzj2 != ',') {
                    if (zzj2 == ']') {
                        zzk(5);
                        return arrayList;
                    }
                    bufferedReader.reset();
                    arrayList.add(zzaVar.zzh(this, bufferedReader));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean zza(BufferedReader bufferedReader, FastJsonResponse fastJsonResponse) {
        byte[] decode;
        HashMap hashMap;
        Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
        String zza2 = zza(bufferedReader);
        if (zza2 == null) {
            zzk(1);
            return false;
        }
        while (zza2 != null) {
            FastJsonResponse.Field<?, ?> field = fieldMappings.get(zza2);
            if (field == null) {
                zza2 = zzb(bufferedReader);
            } else {
                this.zzxb.push(4);
                switch (field.getTypeIn()) {
                    case 0:
                        if (!field.isTypeInArray()) {
                            fastJsonResponse.setInteger(field, zzd(bufferedReader));
                            break;
                        } else {
                            fastJsonResponse.setIntegers((FastJsonResponse.Field) field, (ArrayList<Integer>) zza(bufferedReader, zzxc));
                            break;
                        }
                    case 1:
                        if (!field.isTypeInArray()) {
                            fastJsonResponse.setBigInteger(field, zzf(bufferedReader));
                            break;
                        } else {
                            fastJsonResponse.setBigIntegers((FastJsonResponse.Field) field, (ArrayList<BigInteger>) zza(bufferedReader, zzxi));
                            break;
                        }
                    case 2:
                        if (!field.isTypeInArray()) {
                            fastJsonResponse.setLong(field, zze(bufferedReader));
                            break;
                        } else {
                            fastJsonResponse.setLongs((FastJsonResponse.Field) field, (ArrayList<Long>) zza(bufferedReader, zzxd));
                            break;
                        }
                    case 3:
                        if (!field.isTypeInArray()) {
                            fastJsonResponse.setFloat(field, zzg(bufferedReader));
                            break;
                        } else {
                            fastJsonResponse.setFloats((FastJsonResponse.Field) field, (ArrayList<Float>) zza(bufferedReader, zzxe));
                            break;
                        }
                    case 4:
                        if (!field.isTypeInArray()) {
                            fastJsonResponse.setDouble(field, zzh(bufferedReader));
                            break;
                        } else {
                            fastJsonResponse.setDoubles((FastJsonResponse.Field) field, (ArrayList<Double>) zza(bufferedReader, zzxf));
                            break;
                        }
                    case 5:
                        if (!field.isTypeInArray()) {
                            fastJsonResponse.setBigDecimal(field, zzi(bufferedReader));
                            break;
                        } else {
                            fastJsonResponse.setBigDecimals((FastJsonResponse.Field) field, (ArrayList<BigDecimal>) zza(bufferedReader, zzxj));
                            break;
                        }
                    case 6:
                        if (!field.isTypeInArray()) {
                            fastJsonResponse.setBoolean(field, zza(bufferedReader, false));
                            break;
                        } else {
                            fastJsonResponse.setBooleans((FastJsonResponse.Field) field, (ArrayList<Boolean>) zza(bufferedReader, zzxg));
                            break;
                        }
                    case 7:
                        if (!field.isTypeInArray()) {
                            fastJsonResponse.setString(field, zzc(bufferedReader));
                            break;
                        } else {
                            fastJsonResponse.setStrings((FastJsonResponse.Field) field, (ArrayList<String>) zza(bufferedReader, zzxh));
                            break;
                        }
                    case 8:
                        decode = Base64Utils.decode(zza(bufferedReader, this.zzws, this.zzwu, zzxa));
                        fastJsonResponse.setDecodedBytes(field, decode);
                        break;
                    case 9:
                        decode = Base64Utils.decodeUrlSafe(zza(bufferedReader, this.zzws, this.zzwu, zzxa));
                        fastJsonResponse.setDecodedBytes(field, decode);
                        break;
                    case 10:
                        char zzj = zzj(bufferedReader);
                        if (zzj == 'n') {
                            zzb(bufferedReader, zzwv);
                            hashMap = null;
                        } else if (zzj != '{') {
                            throw new ParseException("Expected start of a map object");
                        } else {
                            this.zzxb.push(1);
                            hashMap = new HashMap();
                            while (true) {
                                char zzj2 = zzj(bufferedReader);
                                if (zzj2 == 0) {
                                    throw new ParseException("Unexpected EOF");
                                }
                                if (zzj2 == '\"') {
                                    String zzb = zzb(bufferedReader, this.zzwr, this.zzwt, null);
                                    if (zzj(bufferedReader) != ':') {
                                        String valueOf = String.valueOf(zzb);
                                        throw new ParseException(valueOf.length() != 0 ? "No map value found for key ".concat(valueOf) : new String("No map value found for key "));
                                    } else if (zzj(bufferedReader) != '\"') {
                                        String valueOf2 = String.valueOf(zzb);
                                        throw new ParseException(valueOf2.length() != 0 ? "Expected String value for key ".concat(valueOf2) : new String("Expected String value for key "));
                                    } else {
                                        hashMap.put(zzb, zzb(bufferedReader, this.zzwr, this.zzwt, null));
                                        char zzj3 = zzj(bufferedReader);
                                        if (zzj3 != ',') {
                                            if (zzj3 != '}') {
                                                StringBuilder sb = new StringBuilder(48);
                                                sb.append("Unexpected character while parsing string map: ");
                                                sb.append(zzj3);
                                                throw new ParseException(sb.toString());
                                            }
                                        }
                                    }
                                } else if (zzj2 != '}') {
                                }
                            }
                            zzk(1);
                        }
                        fastJsonResponse.setStringMap(field, hashMap);
                        break;
                    case 11:
                        if (field.isTypeInArray()) {
                            char zzj4 = zzj(bufferedReader);
                            if (zzj4 != 'n') {
                                this.zzxb.push(5);
                                if (zzj4 == '[') {
                                    fastJsonResponse.addConcreteTypeArrayInternal(field, field.getOutputFieldName(), zza(bufferedReader, field));
                                    break;
                                } else {
                                    throw new ParseException("Expected array start");
                                }
                            } else {
                                zzb(bufferedReader, zzwv);
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.getOutputFieldName(), null);
                                break;
                            }
                        } else {
                            char zzj5 = zzj(bufferedReader);
                            if (zzj5 == 'n') {
                                zzb(bufferedReader, zzwv);
                                fastJsonResponse.addConcreteTypeInternal(field, field.getOutputFieldName(), null);
                                break;
                            } else {
                                this.zzxb.push(1);
                                if (zzj5 != '{') {
                                    throw new ParseException("Expected start of object");
                                }
                                try {
                                    FastJsonResponse newConcreteTypeInstance = field.newConcreteTypeInstance();
                                    zza(bufferedReader, newConcreteTypeInstance);
                                    fastJsonResponse.addConcreteTypeInternal(field, field.getOutputFieldName(), newConcreteTypeInstance);
                                    break;
                                } catch (IllegalAccessException e) {
                                    throw new ParseException("Error instantiating inner object", e);
                                } catch (InstantiationException e2) {
                                    throw new ParseException("Error instantiating inner object", e2);
                                }
                            }
                        }
                    default:
                        int typeIn = field.getTypeIn();
                        StringBuilder sb2 = new StringBuilder(30);
                        sb2.append("Invalid field type ");
                        sb2.append(typeIn);
                        throw new ParseException(sb2.toString());
                }
                zzk(4);
                zzk(2);
                char zzj6 = zzj(bufferedReader);
                if (zzj6 == ',') {
                    zza2 = zza(bufferedReader);
                } else if (zzj6 != '}') {
                    StringBuilder sb3 = new StringBuilder(55);
                    sb3.append("Expected end of object or field separator, but found: ");
                    sb3.append(zzj6);
                    throw new ParseException(sb3.toString());
                } else {
                    zza2 = null;
                }
            }
        }
        PostProcessor<? extends FastJsonResponse> postProcessor = fastJsonResponse.getPostProcessor();
        if (postProcessor != null) {
            postProcessor.postProcess(fastJsonResponse);
        }
        zzk(1);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zza(BufferedReader bufferedReader, boolean z) {
        while (true) {
            char zzj = zzj(bufferedReader);
            if (zzj != '\"') {
                if (zzj == 'f') {
                    zzb(bufferedReader, z ? zzwz : zzwy);
                    return false;
                } else if (zzj == 'n') {
                    zzb(bufferedReader, zzwv);
                    return false;
                } else if (zzj == 't') {
                    zzb(bufferedReader, z ? zzwx : zzww);
                    return true;
                } else {
                    StringBuilder sb = new StringBuilder(19);
                    sb.append("Unexpected token: ");
                    sb.append(zzj);
                    throw new ParseException(sb.toString());
                }
            } else if (z) {
                throw new ParseException("No boolean value found in string");
            } else {
                z = true;
            }
        }
    }

    private final String zzb(BufferedReader bufferedReader) {
        bufferedReader.mark(1024);
        char zzj = zzj(bufferedReader);
        if (zzj == '\"') {
            if (bufferedReader.read(this.zzwq) == -1) {
                throw new ParseException("Unexpected EOF while parsing string");
            }
            char c2 = this.zzwq[0];
            boolean z = false;
            do {
                if (c2 != '\"' || z) {
                    z = c2 == '\\' ? !z : false;
                    if (bufferedReader.read(this.zzwq) == -1) {
                        throw new ParseException("Unexpected EOF while parsing string");
                    }
                    c2 = this.zzwq[0];
                }
            } while (!Character.isISOControl(c2));
            throw new ParseException("Unexpected control character while reading string");
        } else if (zzj == ',') {
            throw new ParseException("Missing value");
        } else {
            int i = 1;
            if (zzj == '[') {
                this.zzxb.push(5);
                bufferedReader.mark(32);
                if (zzj(bufferedReader) != ']') {
                    bufferedReader.reset();
                    boolean z2 = false;
                    boolean z3 = false;
                    while (i > 0) {
                        char zzj2 = zzj(bufferedReader);
                        if (zzj2 == 0) {
                            throw new ParseException("Unexpected EOF while parsing array");
                        }
                        if (Character.isISOControl(zzj2)) {
                            throw new ParseException("Unexpected control character while reading array");
                        }
                        if (zzj2 == '\"' && !z2) {
                            z3 = !z3;
                        }
                        if (zzj2 == '[' && !z3) {
                            i++;
                        }
                        if (zzj2 == ']' && !z3) {
                            i--;
                        }
                        z2 = (zzj2 != '\\' || !z3) ? false : !z2;
                    }
                }
                zzk(5);
            } else if (zzj != '{') {
                bufferedReader.reset();
                zza(bufferedReader, this.zzws);
            } else {
                this.zzxb.push(1);
                bufferedReader.mark(32);
                char zzj3 = zzj(bufferedReader);
                if (zzj3 == '}') {
                    zzk(1);
                } else if (zzj3 != '\"') {
                    StringBuilder sb = new StringBuilder(18);
                    sb.append("Unexpected token ");
                    sb.append(zzj3);
                    throw new ParseException(sb.toString());
                } else {
                    bufferedReader.reset();
                    zza(bufferedReader);
                    do {
                    } while (zzb(bufferedReader) != null);
                    zzk(1);
                }
            }
        }
        char zzj4 = zzj(bufferedReader);
        if (zzj4 == ',') {
            zzk(2);
            return zza(bufferedReader);
        } else if (zzj4 == '}') {
            zzk(2);
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder(18);
            sb2.append("Unexpected token ");
            sb2.append(zzj4);
            throw new ParseException(sb2.toString());
        }
    }

    private static String zzb(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, char[] cArr2) {
        boolean z;
        sb.setLength(0);
        bufferedReader.mark(cArr.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                boolean z4 = z3;
                boolean z5 = z2;
                for (int i = 0; i < read; i++) {
                    char c2 = cArr[i];
                    if (Character.isISOControl(c2)) {
                        if (cArr2 != null) {
                            for (char c3 : cArr2) {
                                if (c3 == c2) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        z = false;
                        if (!z) {
                            throw new ParseException("Unexpected control character while reading string");
                        }
                    }
                    if (c2 == '\"' && !z5) {
                        sb.append(cArr, 0, i);
                        bufferedReader.reset();
                        bufferedReader.skip(i + 1);
                        return z4 ? JsonUtils.unescapeString(sb.toString()) : sb.toString();
                    }
                    if (c2 == '\\') {
                        z5 = !z5;
                        z4 = true;
                    } else {
                        z5 = false;
                    }
                }
                sb.append(cArr, 0, read);
                bufferedReader.mark(cArr.length);
                z2 = z5;
                z3 = z4;
            } else {
                throw new ParseException("Unexpected EOF while parsing string");
            }
        }
    }

    private final void zzb(BufferedReader bufferedReader, char[] cArr) {
        int i = 0;
        while (i < cArr.length) {
            int read = bufferedReader.read(this.zzwr, 0, cArr.length - i);
            if (read == -1) {
                throw new ParseException("Unexpected EOF");
            }
            for (int i2 = 0; i2 < read; i2++) {
                if (cArr[i2 + i] != this.zzwr[i2]) {
                    throw new ParseException("Unexpected character");
                }
            }
            i += read;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zzc(BufferedReader bufferedReader) {
        return zza(bufferedReader, this.zzwr, this.zzwt, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzd(BufferedReader bufferedReader) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int zza2 = zza(bufferedReader, this.zzws);
        if (zza2 == 0) {
            return 0;
        }
        char[] cArr = this.zzws;
        if (zza2 <= 0) {
            throw new ParseException("No number to parse");
        }
        if (cArr[0] == '-') {
            i = 1;
            z = true;
            i2 = PKIFailureInfo.systemUnavail;
        } else {
            i = 0;
            z = false;
            i2 = -2147483647;
        }
        if (i < zza2) {
            i3 = i + 1;
            int digit = Character.digit(cArr[i], 10);
            if (digit < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            i4 = -digit;
        } else {
            i3 = i;
            i4 = 0;
        }
        while (i3 < zza2) {
            int i5 = i3 + 1;
            int digit2 = Character.digit(cArr[i3], 10);
            if (digit2 < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            if (i4 < -214748364) {
                throw new ParseException("Number too large");
            }
            int i6 = i4 * 10;
            if (i6 < i2 + digit2) {
                throw new ParseException("Number too large");
            }
            i4 = i6 - digit2;
            i3 = i5;
        }
        if (!z) {
            return -i4;
        }
        if (i3 <= 1) {
            throw new ParseException("No digits to parse");
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zze(BufferedReader bufferedReader) {
        long j;
        boolean z;
        long j2;
        int i;
        int zza2 = zza(bufferedReader, this.zzws);
        if (zza2 == 0) {
            return 0L;
        }
        char[] cArr = this.zzws;
        if (zza2 <= 0) {
            throw new ParseException("No number to parse");
        }
        int i2 = 0;
        if (cArr[0] == '-') {
            j = Long.MIN_VALUE;
            i2 = 1;
            z = true;
        } else {
            j = -9223372036854775807L;
            z = false;
        }
        if (i2 < zza2) {
            i = i2 + 1;
            int digit = Character.digit(cArr[i2], 10);
            if (digit < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            j2 = -digit;
        } else {
            j2 = 0;
            i = i2;
        }
        while (i < zza2) {
            int i3 = i + 1;
            int digit2 = Character.digit(cArr[i], 10);
            if (digit2 < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            if (j2 < -922337203685477580L) {
                throw new ParseException("Number too large");
            }
            long j3 = j2 * 10;
            long j4 = digit2;
            if (j3 < j + j4) {
                throw new ParseException("Number too large");
            }
            j2 = j3 - j4;
            i = i3;
        }
        if (!z) {
            return -j2;
        }
        if (i <= 1) {
            throw new ParseException("No digits to parse");
        }
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BigInteger zzf(BufferedReader bufferedReader) {
        int zza2 = zza(bufferedReader, this.zzws);
        if (zza2 == 0) {
            return null;
        }
        return new BigInteger(new String(this.zzws, 0, zza2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float zzg(BufferedReader bufferedReader) {
        int zza2 = zza(bufferedReader, this.zzws);
        return zza2 == 0 ? BitmapDescriptorFactory.HUE_RED : Float.parseFloat(new String(this.zzws, 0, zza2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double zzh(BufferedReader bufferedReader) {
        int zza2 = zza(bufferedReader, this.zzws);
        if (zza2 == 0) {
            return 0.0d;
        }
        return Double.parseDouble(new String(this.zzws, 0, zza2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BigDecimal zzi(BufferedReader bufferedReader) {
        int zza2 = zza(bufferedReader, this.zzws);
        if (zza2 == 0) {
            return null;
        }
        return new BigDecimal(new String(this.zzws, 0, zza2));
    }

    private final char zzj(BufferedReader bufferedReader) {
        if (bufferedReader.read(this.zzwq) == -1) {
            return (char) 0;
        }
        while (Character.isWhitespace(this.zzwq[0])) {
            if (bufferedReader.read(this.zzwq) == -1) {
                return (char) 0;
            }
        }
        return this.zzwq[0];
    }

    private final void zzk(int i) {
        if (this.zzxb.isEmpty()) {
            StringBuilder sb = new StringBuilder(46);
            sb.append("Expected state ");
            sb.append(i);
            sb.append(" but had empty stack");
            throw new ParseException(sb.toString());
        }
        int intValue = this.zzxb.pop().intValue();
        if (intValue == i) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Expected state ");
        sb2.append(i);
        sb2.append(" but had ");
        sb2.append(intValue);
        throw new ParseException(sb2.toString());
    }

    public void parse(InputStream inputStream, T t) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            try {
                this.zzxb.push(0);
                char zzj = zzj(bufferedReader);
                if (zzj == 0) {
                    throw new ParseException("No data to parse");
                }
                if (zzj == '[') {
                    this.zzxb.push(5);
                    Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = t.getFieldMappings();
                    if (fieldMappings.size() != 1) {
                        throw new ParseException("Object array response class must have a single Field");
                    }
                    FastJsonResponse.Field<?, ?> value = fieldMappings.entrySet().iterator().next().getValue();
                    t.addConcreteTypeArrayInternal(value, value.getOutputFieldName(), zza(bufferedReader, value));
                } else if (zzj != '{') {
                    StringBuilder sb = new StringBuilder(19);
                    sb.append("Unexpected token: ");
                    sb.append(zzj);
                    throw new ParseException(sb.toString());
                } else {
                    this.zzxb.push(1);
                    zza(bufferedReader, t);
                }
                zzk(0);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                    Log.w("FastParser", "Failed to close reader while parsing.");
                }
            } catch (IOException e) {
                throw new ParseException(e);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
                Log.w("FastParser", "Failed to close reader while parsing.");
            }
            throw th;
        }
    }

    public void parse(String str, T t) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        try {
            parse((InputStream) byteArrayInputStream, (ByteArrayInputStream) t);
        } finally {
            try {
                byteArrayInputStream.close();
            } catch (IOException unused) {
                Log.w("FastParser", "Failed to close the input stream while parsing.");
            }
        }
    }
}
