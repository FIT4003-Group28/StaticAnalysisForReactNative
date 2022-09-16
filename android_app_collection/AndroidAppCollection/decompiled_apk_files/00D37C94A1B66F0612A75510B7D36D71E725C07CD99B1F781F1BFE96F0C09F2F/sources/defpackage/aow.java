package defpackage;

import android.content.res.AssetManager;
import android.system.OsConstants;
import android.util.Log;
import j$.util.DesugarTimeZone;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: aow  reason: default package */
/* loaded from: classes.dex */
public final class aow {
    private static final aou[] A;
    private static final aou[] B;
    private static final aou C;
    private static final aou[] D;
    private static final aou[] E;
    private static final aou[] F;
    private static final aou[] G;
    private static final aou[] H;
    private static final HashMap[] I;

    /* renamed from: J  reason: collision with root package name */
    private static final HashMap[] f85J;
    private static final HashSet K;
    private static final HashMap L;
    private static final byte[] M;
    public static final int[] a;
    public static final int[] b;
    static final byte[] c;
    static final String[] d;
    static final int[] e;
    static final byte[] f;
    static final aou[][] g;
    static final Charset h;
    static final byte[] i;
    private static final byte[] j;
    private static final byte[] k;
    private static final byte[] l;
    private static final byte[] m;
    private static final byte[] n;
    private static final byte[] o;
    private static final byte[] p;
    private static final byte[] q;
    private static final byte[] r;
    private static final byte[] s;
    private static final byte[] t;
    private static final byte[] u;
    private static SimpleDateFormat v;
    private static SimpleDateFormat w;
    private static final aou[] x;
    private static final aou[] y;
    private static final aou[] z;
    private FileDescriptor N;
    private AssetManager.AssetInputStream O;
    private int P;
    private final HashMap[] Q;
    private final Set R;
    private ByteOrder S;
    private boolean T;
    private int U;
    private int V;
    private int W;
    private int X;

    static {
        aou[] aouVarArr;
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        a = new int[]{8, 8, 8};
        b = new int[]{8};
        c = new byte[]{-1, -40, -1};
        j = new byte[]{102, 116, 121, 112};
        k = new byte[]{109, 105, 102, 49};
        l = new byte[]{104, 101, 105, 99};
        m = new byte[]{79, 76, 89, 77, 80, 0};
        n = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        o = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        p = new byte[]{101, 88, 73, 102};
        q = new byte[]{73, 72, 68, 82};
        r = new byte[]{73, 69, 78, 68};
        s = new byte[]{82, 73, 70, 70};
        t = new byte[]{87, 69, 66, 80};
        u = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        d = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        e = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        aou[] aouVarArr2 = {new aou("NewSubfileType", 254, 4), new aou("SubfileType", PrivateKeyType.INVALID, 4), new aou("ImageWidth", 256, 3, 4), new aou("ImageLength", 257, 3, 4), new aou("BitsPerSample", 258, 3), new aou("Compression", 259, 3), new aou("PhotometricInterpretation", 262, 3), new aou("ImageDescription", 270, 2), new aou("Make", 271, 2), new aou("Model", 272, 2), new aou("StripOffsets", 273, 3, 4), new aou("Orientation", 274, 3), new aou("SamplesPerPixel", 277, 3), new aou("RowsPerStrip", 278, 3, 4), new aou("StripByteCounts", 279, 3, 4), new aou("XResolution", 282, 5), new aou("YResolution", 283, 5), new aou("PlanarConfiguration", 284, 3), new aou("ResolutionUnit", 296, 3), new aou("TransferFunction", 301, 3), new aou("Software", 305, 2), new aou("DateTime", 306, 2), new aou("Artist", 315, 2), new aou("WhitePoint", 318, 5), new aou("PrimaryChromaticities", 319, 5), new aou("SubIFDPointer", 330, 4), new aou("JPEGInterchangeFormat", 513, 4), new aou("JPEGInterchangeFormatLength", 514, 4), new aou("YCbCrCoefficients", 529, 5), new aou("YCbCrSubSampling", 530, 3), new aou("YCbCrPositioning", 531, 3), new aou("ReferenceBlackWhite", 532, 5), new aou("Copyright", 33432, 2), new aou("ExifIFDPointer", 34665, 4), new aou("GPSInfoIFDPointer", 34853, 4), new aou("SensorTopBorder", 4, 4), new aou("SensorLeftBorder", 5, 4), new aou("SensorBottomBorder", 6, 4), new aou("SensorRightBorder", 7, 4), new aou("ISO", 23, 3), new aou("JpgFromRaw", 46, 7), new aou("Xmp", 700, 1)};
        x = aouVarArr2;
        aou[] aouVarArr3 = {new aou("ExposureTime", 33434, 5), new aou("FNumber", 33437, 5), new aou("ExposureProgram", 34850, 3), new aou("SpectralSensitivity", 34852, 2), new aou("PhotographicSensitivity", 34855, 3), new aou("OECF", 34856, 7), new aou("SensitivityType", 34864, 3), new aou("StandardOutputSensitivity", 34865, 4), new aou("RecommendedExposureIndex", 34866, 4), new aou("ISOSpeed", 34867, 4), new aou("ISOSpeedLatitudeyyy", 34868, 4), new aou("ISOSpeedLatitudezzz", 34869, 4), new aou("ExifVersion", 36864, 2), new aou("DateTimeOriginal", 36867, 2), new aou("DateTimeDigitized", 36868, 2), new aou("OffsetTime", 36880, 2), new aou("OffsetTimeOriginal", 36881, 2), new aou("OffsetTimeDigitized", 36882, 2), new aou("ComponentsConfiguration", 37121, 7), new aou("CompressedBitsPerPixel", 37122, 5), new aou("ShutterSpeedValue", 37377, 10), new aou("ApertureValue", 37378, 5), new aou("BrightnessValue", 37379, 10), new aou("ExposureBiasValue", 37380, 10), new aou("MaxApertureValue", 37381, 5), new aou("SubjectDistance", 37382, 5), new aou("MeteringMode", 37383, 3), new aou("LightSource", 37384, 3), new aou("Flash", 37385, 3), new aou("FocalLength", 37386, 5), new aou("SubjectArea", 37396, 3), new aou("MakerNote", 37500, 7), new aou("UserComment", 37510, 7), new aou("SubSecTime", 37520, 2), new aou("SubSecTimeOriginal", 37521, 2), new aou("SubSecTimeDigitized", 37522, 2), new aou("FlashpixVersion", 40960, 7), new aou("ColorSpace", 40961, 3), new aou("PixelXDimension", 40962, 3, 4), new aou("PixelYDimension", 40963, 3, 4), new aou("RelatedSoundFile", 40964, 2), new aou("InteroperabilityIFDPointer", 40965, 4), new aou("FlashEnergy", 41483, 5), new aou("SpatialFrequencyResponse", 41484, 7), new aou("FocalPlaneXResolution", 41486, 5), new aou("FocalPlaneYResolution", 41487, 5), new aou("FocalPlaneResolutionUnit", 41488, 3), new aou("SubjectLocation", 41492, 3), new aou("ExposureIndex", 41493, 5), new aou("SensingMethod", 41495, 3), new aou("FileSource", 41728, 7), new aou("SceneType", 41729, 7), new aou("CFAPattern", 41730, 7), new aou("CustomRendered", 41985, 3), new aou("ExposureMode", 41986, 3), new aou("WhiteBalance", 41987, 3), new aou("DigitalZoomRatio", 41988, 5), new aou("FocalLengthIn35mmFilm", 41989, 3), new aou("SceneCaptureType", 41990, 3), new aou("GainControl", 41991, 3), new aou("Contrast", 41992, 3), new aou("Saturation", 41993, 3), new aou("Sharpness", 41994, 3), new aou("DeviceSettingDescription", 41995, 7), new aou("SubjectDistanceRange", 41996, 3), new aou("ImageUniqueID", 42016, 2), new aou("CameraOwnerName", 42032, 2), new aou("BodySerialNumber", 42033, 2), new aou("LensSpecification", 42034, 5), new aou("LensMake", 42035, 2), new aou("LensModel", 42036, 2), new aou("Gamma", 42240, 5), new aou("DNGVersion", 50706, 1), new aou("DefaultCropSize", 50720, 3, 4)};
        y = aouVarArr3;
        aou[] aouVarArr4 = {new aou("GPSVersionID", 0, 1), new aou("GPSLatitudeRef", 1, 2), new aou("GPSLatitude", 2, 5, 10), new aou("GPSLongitudeRef", 3, 2), new aou("GPSLongitude", 4, 5, 10), new aou("GPSAltitudeRef", 5, 1), new aou("GPSAltitude", 6, 5), new aou("GPSTimeStamp", 7, 5), new aou("GPSSatellites", 8, 2), new aou("GPSStatus", 9, 2), new aou("GPSMeasureMode", 10, 2), new aou("GPSDOP", 11, 5), new aou("GPSSpeedRef", 12, 2), new aou("GPSSpeed", 13, 5), new aou("GPSTrackRef", 14, 2), new aou("GPSTrack", 15, 5), new aou("GPSImgDirectionRef", 16, 2), new aou("GPSImgDirection", 17, 5), new aou("GPSMapDatum", 18, 2), new aou("GPSDestLatitudeRef", 19, 2), new aou("GPSDestLatitude", 20, 5), new aou("GPSDestLongitudeRef", 21, 2), new aou("GPSDestLongitude", 22, 5), new aou("GPSDestBearingRef", 23, 2), new aou("GPSDestBearing", 24, 5), new aou("GPSDestDistanceRef", 25, 2), new aou("GPSDestDistance", 26, 5), new aou("GPSProcessingMethod", 27, 7), new aou("GPSAreaInformation", 28, 7), new aou("GPSDateStamp", 29, 2), new aou("GPSDifferential", 30, 3), new aou("GPSHPositioningError", 31, 5)};
        z = aouVarArr4;
        aou[] aouVarArr5 = {new aou("InteroperabilityIndex", 1, 2)};
        A = aouVarArr5;
        aou[] aouVarArr6 = {new aou("NewSubfileType", 254, 4), new aou("SubfileType", PrivateKeyType.INVALID, 4), new aou("ThumbnailImageWidth", 256, 3, 4), new aou("ThumbnailImageLength", 257, 3, 4), new aou("BitsPerSample", 258, 3), new aou("Compression", 259, 3), new aou("PhotometricInterpretation", 262, 3), new aou("ImageDescription", 270, 2), new aou("Make", 271, 2), new aou("Model", 272, 2), new aou("StripOffsets", 273, 3, 4), new aou("ThumbnailOrientation", 274, 3), new aou("SamplesPerPixel", 277, 3), new aou("RowsPerStrip", 278, 3, 4), new aou("StripByteCounts", 279, 3, 4), new aou("XResolution", 282, 5), new aou("YResolution", 283, 5), new aou("PlanarConfiguration", 284, 3), new aou("ResolutionUnit", 296, 3), new aou("TransferFunction", 301, 3), new aou("Software", 305, 2), new aou("DateTime", 306, 2), new aou("Artist", 315, 2), new aou("WhitePoint", 318, 5), new aou("PrimaryChromaticities", 319, 5), new aou("SubIFDPointer", 330, 4), new aou("JPEGInterchangeFormat", 513, 4), new aou("JPEGInterchangeFormatLength", 514, 4), new aou("YCbCrCoefficients", 529, 5), new aou("YCbCrSubSampling", 530, 3), new aou("YCbCrPositioning", 531, 3), new aou("ReferenceBlackWhite", 532, 5), new aou("Xmp", 700, 1), new aou("Copyright", 33432, 2), new aou("ExifIFDPointer", 34665, 4), new aou("GPSInfoIFDPointer", 34853, 4), new aou("DNGVersion", 50706, 1), new aou("DefaultCropSize", 50720, 3, 4)};
        B = aouVarArr6;
        C = new aou("StripOffsets", 273, 3);
        aou[] aouVarArr7 = {new aou("ThumbnailImage", 256, 7), new aou("CameraSettingsIFDPointer", 8224, 4), new aou("ImageProcessingIFDPointer", 8256, 4)};
        D = aouVarArr7;
        aou[] aouVarArr8 = {new aou("PreviewImageStart", 257, 4), new aou("PreviewImageLength", 258, 4)};
        E = aouVarArr8;
        aou[] aouVarArr9 = {new aou("AspectFrame", 4371, 3)};
        F = aouVarArr9;
        aou[] aouVarArr10 = {new aou("ColorSpace", 55, 3)};
        G = aouVarArr10;
        g = new aou[][]{aouVarArr2, aouVarArr3, aouVarArr4, aouVarArr5, aouVarArr6, aouVarArr2, aouVarArr7, aouVarArr8, aouVarArr9, aouVarArr10};
        H = new aou[]{new aou("SubIFDPointer", 330, 4), new aou("ExifIFDPointer", 34665, 4), new aou("GPSInfoIFDPointer", 34853, 4), new aou("InteroperabilityIFDPointer", 40965, 4), new aou("CameraSettingsIFDPointer", 8224, 1), new aou("ImageProcessingIFDPointer", 8256, 1)};
        I = new HashMap[10];
        f85J = new HashMap[10];
        K = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        L = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        h = forName;
        i = "Exif\u0000\u0000".getBytes(forName);
        M = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        v = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        w = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            aou[][] aouVarArr11 = g;
            int length = aouVarArr11.length;
            if (i2 >= 10) {
                HashMap hashMap = L;
                aou[] aouVarArr12 = H;
                hashMap.put(Integer.valueOf(aouVarArr12[0].a), 5);
                hashMap.put(Integer.valueOf(aouVarArr12[1].a), 1);
                hashMap.put(Integer.valueOf(aouVarArr12[2].a), 2);
                hashMap.put(Integer.valueOf(aouVarArr12[3].a), 3);
                hashMap.put(Integer.valueOf(aouVarArr12[4].a), 7);
                hashMap.put(Integer.valueOf(aouVarArr12[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            I[i2] = new HashMap();
            f85J[i2] = new HashMap();
            for (aou aouVar : aouVarArr11[i2]) {
                I[i2].put(Integer.valueOf(aouVar.a), aouVar);
                f85J[i2].put(aouVar.b, aouVar);
            }
            i2++;
        }
    }

    public aow(InputStream inputStream) {
        aou[][] aouVarArr = g;
        int length = aouVarArr.length;
        this.Q = new HashMap[10];
        int length2 = aouVarArr.length;
        this.R = new HashSet(10);
        this.S = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.O = (AssetManager.AssetInputStream) inputStream;
            this.N = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    aox.a(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.O = null;
                    this.N = fileInputStream.getFD();
                } catch (Exception unused) {
                }
            }
            this.O = null;
            this.N = null;
        }
        i(inputStream);
    }

    private final aot c(String str) {
        if (true == "ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        int i2 = 0;
        while (true) {
            int length = g.length;
            if (i2 < 10) {
                aot aotVar = (aot) this.Q[i2].get(str);
                if (aotVar != null) {
                    return aotVar;
                }
                i2++;
            } else {
                return null;
            }
        }
    }

    private final void d() {
        String a2 = a("DateTimeOriginal");
        if (a2 != null && a("DateTime") == null) {
            this.Q[0].put("DateTime", aot.b(a2));
        }
        if (a("ImageWidth") == null) {
            this.Q[0].put("ImageWidth", aot.c(0L, this.S));
        }
        if (a("ImageLength") == null) {
            this.Q[0].put("ImageLength", aot.c(0L, this.S));
        }
        if (a("Orientation") == null) {
            this.Q[0].put("Orientation", aot.c(0L, this.S));
        }
        if (a("LightSource") == null) {
            this.Q[1].put("LightSource", aot.c(0L, this.S));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x011f, code lost:
        r20.b = r19.S;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0123, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c A[LOOP:0: B:7:0x001c->B:52:0x010c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0113 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void e(defpackage.aos r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aow.e(aos, int, int):void");
    }

    private final void f(aos aosVar) {
        aosVar.b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = o;
        int length = bArr.length;
        aosVar.b(8);
        int length2 = bArr.length;
        int i2 = 8;
        while (true) {
            try {
                int readInt = aosVar.readInt();
                byte[] bArr2 = new byte[4];
                if (aosVar.read(bArr2) == 4) {
                    int i3 = i2 + 8;
                    if (i3 == 16) {
                        if (!Arrays.equals(bArr2, q)) {
                            throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                        }
                        i3 = 16;
                    }
                    if (Arrays.equals(bArr2, r)) {
                        return;
                    }
                    if (!Arrays.equals(bArr2, p)) {
                        int i4 = readInt + 4;
                        aosVar.b(i4);
                        i2 = i3 + i4;
                    } else {
                        byte[] bArr3 = new byte[readInt];
                        if (aosVar.read(bArr3) != readInt) {
                            throw new IOException("Failed to read given length for given PNG chunk type: " + aox.b(bArr2));
                        }
                        int readInt2 = aosVar.readInt();
                        CRC32 crc32 = new CRC32();
                        crc32.update(bArr2);
                        crc32.update(bArr3);
                        if (((int) crc32.getValue()) != readInt2) {
                            throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                        }
                        this.U = i3;
                        k(bArr3, 0);
                        o();
                        m(new aos(bArr3));
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private final void g(aos aosVar) {
        aosVar.b = ByteOrder.LITTLE_ENDIAN;
        int length = s.length;
        aosVar.b(4);
        int readInt = aosVar.readInt() + 8;
        byte[] bArr = t;
        int length2 = bArr.length;
        aosVar.b(4);
        int length3 = bArr.length;
        int i2 = 12;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (aosVar.read(bArr2) == 4) {
                    int readInt2 = aosVar.readInt();
                    int i3 = i2 + 8;
                    if (Arrays.equals(u, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (aosVar.read(bArr3) != readInt2) {
                            throw new IOException("Failed to read given length for given PNG chunk type: " + aox.b(bArr2));
                        }
                        this.U = i3;
                        k(bArr3, 0);
                        m(new aos(bArr3));
                        return;
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    i2 = i3 + readInt2;
                    if (i2 == readInt) {
                        return;
                    }
                    if (i2 <= readInt) {
                        aosVar.b(readInt2);
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private final void h(aos aosVar, HashMap hashMap) {
        aot aotVar = (aot) hashMap.get("JPEGInterchangeFormat");
        aot aotVar2 = (aot) hashMap.get("JPEGInterchangeFormatLength");
        if (aotVar == null || aotVar2 == null) {
            return;
        }
        int a2 = aotVar.a(this.S);
        int a3 = aotVar2.a(this.S);
        if (this.P == 7) {
            a2 += this.V;
        }
        if (a2 <= 0 || a3 <= 0 || this.O != null || this.N != null) {
            return;
        }
        aosVar.skip(a2);
        aosVar.read(new byte[a3]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e7, code lost:
        if (r6 == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0154 A[Catch: all -> 0x04c9, IOException | UnsupportedOperationException -> 0x04ce, TryCatch #15 {IOException | UnsupportedOperationException -> 0x04ce, all -> 0x04c9, blocks: (B:3:0x0005, B:5:0x000c, B:6:0x0018, B:7:0x002d, B:9:0x0040, B:11:0x0046, B:12:0x0051, B:14:0x0054, B:19:0x0071, B:72:0x0107, B:128:0x0199, B:135:0x01aa, B:137:0x01b7, B:139:0x01bd, B:182:0x02bd, B:232:0x0413, B:190:0x02d0, B:191:0x02d7, B:194:0x02db, B:196:0x02ec, B:198:0x0315, B:202:0x0326, B:205:0x0346, B:206:0x0358, B:208:0x0366, B:210:0x0370, B:213:0x0374, B:215:0x037c, B:217:0x0383, B:219:0x038b, B:220:0x038f, B:221:0x03ab, B:199:0x031b, B:201:0x0321, B:224:0x03ca, B:226:0x03dc, B:227:0x03e9, B:230:0x0406, B:231:0x0410, B:233:0x041e, B:235:0x0427, B:237:0x042f, B:239:0x0436, B:241:0x0487, B:243:0x0495, B:244:0x04b9, B:246:0x04c2, B:88:0x0132, B:103:0x014f, B:105:0x0154, B:108:0x015b, B:110:0x0160, B:113:0x0168, B:115:0x016c, B:117:0x0171, B:120:0x017d, B:122:0x0183, B:97:0x0144, B:98:0x0147, B:101:0x014b, B:81:0x0117, B:82:0x011a, B:85:0x011e, B:51:0x00d4, B:50:0x00cd, B:58:0x00e2, B:59:0x00e5, B:124:0x0189, B:126:0x0192, B:140:0x01c2, B:142:0x01e8, B:148:0x0219, B:150:0x022d, B:152:0x0241, B:162:0x0259, B:165:0x026d, B:167:0x0277, B:169:0x0283, B:171:0x028e, B:173:0x0296, B:174:0x029d, B:175:0x02a4, B:176:0x02a5, B:177:0x02ac, B:178:0x02ad, B:179:0x02b4, B:180:0x02b5, B:181:0x02bc, B:143:0x01fb, B:145:0x0201, B:186:0x02c4, B:187:0x02cb), top: B:257:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0427 A[Catch: all -> 0x04c9, IOException | UnsupportedOperationException -> 0x04ce, TryCatch #15 {IOException | UnsupportedOperationException -> 0x04ce, all -> 0x04c9, blocks: (B:3:0x0005, B:5:0x000c, B:6:0x0018, B:7:0x002d, B:9:0x0040, B:11:0x0046, B:12:0x0051, B:14:0x0054, B:19:0x0071, B:72:0x0107, B:128:0x0199, B:135:0x01aa, B:137:0x01b7, B:139:0x01bd, B:182:0x02bd, B:232:0x0413, B:190:0x02d0, B:191:0x02d7, B:194:0x02db, B:196:0x02ec, B:198:0x0315, B:202:0x0326, B:205:0x0346, B:206:0x0358, B:208:0x0366, B:210:0x0370, B:213:0x0374, B:215:0x037c, B:217:0x0383, B:219:0x038b, B:220:0x038f, B:221:0x03ab, B:199:0x031b, B:201:0x0321, B:224:0x03ca, B:226:0x03dc, B:227:0x03e9, B:230:0x0406, B:231:0x0410, B:233:0x041e, B:235:0x0427, B:237:0x042f, B:239:0x0436, B:241:0x0487, B:243:0x0495, B:244:0x04b9, B:246:0x04c2, B:88:0x0132, B:103:0x014f, B:105:0x0154, B:108:0x015b, B:110:0x0160, B:113:0x0168, B:115:0x016c, B:117:0x0171, B:120:0x017d, B:122:0x0183, B:97:0x0144, B:98:0x0147, B:101:0x014b, B:81:0x0117, B:82:0x011a, B:85:0x011e, B:51:0x00d4, B:50:0x00cd, B:58:0x00e2, B:59:0x00e5, B:124:0x0189, B:126:0x0192, B:140:0x01c2, B:142:0x01e8, B:148:0x0219, B:150:0x022d, B:152:0x0241, B:162:0x0259, B:165:0x026d, B:167:0x0277, B:169:0x0283, B:171:0x028e, B:173:0x0296, B:174:0x029d, B:175:0x02a4, B:176:0x02a5, B:177:0x02ac, B:178:0x02ad, B:179:0x02b4, B:180:0x02b5, B:181:0x02bc, B:143:0x01fb, B:145:0x0201, B:186:0x02c4, B:187:0x02cb), top: B:257:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void i(java.io.InputStream r26) {
        /*
            Method dump skipped, instructions count: 1234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aow.i(java.io.InputStream):void");
    }

    private final void j(aos aosVar) {
        ByteOrder t2 = t(aosVar);
        this.S = t2;
        aosVar.b = t2;
        int readUnsignedShort = aosVar.readUnsignedShort();
        int i2 = this.P;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = aosVar.readInt();
            if (readInt < 8) {
                throw new IOException("Invalid first Ifd offset: " + readInt);
            }
            int i3 = readInt - 8;
            if (i3 <= 0) {
                return;
            }
            aosVar.b(i3);
            return;
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    private final void k(byte[] bArr, int i2) {
        aos aosVar = new aos(bArr, (byte[]) null);
        j(aosVar);
        r(aosVar, i2);
    }

    private final void l(int i2, String str, String str2) {
        if (this.Q[i2].isEmpty() || this.Q[i2].get(str) == null) {
            return;
        }
        HashMap hashMap = this.Q[i2];
        hashMap.put(str2, (aot) hashMap.get(str));
        this.Q[i2].remove(str);
    }

    private final void m(aos aosVar) {
        int length;
        int length2;
        aot aotVar;
        HashMap hashMap = this.Q[4];
        aot aotVar2 = (aot) hashMap.get("Compression");
        if (aotVar2 != null) {
            int a2 = aotVar2.a(this.S);
            if (a2 != 1) {
                if (a2 == 6) {
                    h(aosVar, hashMap);
                    return;
                } else if (a2 != 7) {
                    return;
                }
            }
            aot aotVar3 = (aot) hashMap.get("BitsPerSample");
            if (aotVar3 == null) {
                return;
            }
            int[] iArr = (int[]) aotVar3.f(this.S);
            int[] iArr2 = a;
            if (!Arrays.equals(iArr2, iArr)) {
                if (this.P != 3 || (aotVar = (aot) hashMap.get("PhotometricInterpretation")) == null) {
                    return;
                }
                int a3 = aotVar.a(this.S);
                if (a3 != 1) {
                    if (a3 != 6 || !Arrays.equals(iArr, iArr2)) {
                        return;
                    }
                } else if (!Arrays.equals(iArr, b)) {
                    return;
                }
            }
            aot aotVar4 = (aot) hashMap.get("StripOffsets");
            aot aotVar5 = (aot) hashMap.get("StripByteCounts");
            if (aotVar4 == null || aotVar5 == null) {
                return;
            }
            long[] d2 = aox.d(aotVar4.f(this.S));
            long[] d3 = aox.d(aotVar5.f(this.S));
            if (d2 == null || (length = d2.length) == 0) {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            } else if (d3 == null || (length2 = d3.length) == 0) {
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            } else if (length == length2) {
                long j2 = 0;
                for (long j3 : d3) {
                    j2 += j3;
                }
                byte[] bArr = new byte[(int) j2];
                this.T = true;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int length3 = d2.length;
                    if (i2 >= length3) {
                        if (!this.T) {
                            return;
                        }
                        long j4 = d2[0];
                        return;
                    }
                    int i5 = (int) d2[i2];
                    int i6 = (int) d3[i2];
                    if (i2 < length3 - 1 && i5 + i6 != d2[i2 + 1]) {
                        this.T = false;
                    }
                    int i7 = i5 - i3;
                    if (i7 < 0) {
                        return;
                    }
                    long j5 = i7;
                    if (aosVar.skip(j5) != j5) {
                        return;
                    }
                    int i8 = i3 + i7;
                    byte[] bArr2 = new byte[i6];
                    if (aosVar.read(bArr2) != i6) {
                        return;
                    }
                    i3 = i8 + i6;
                    System.arraycopy(bArr2, 0, bArr, i4, i6);
                    i4 += i6;
                    i2++;
                }
            } else {
                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            }
        } else {
            h(aosVar, hashMap);
        }
    }

    private final void n(int i2, int i3) {
        if (this.Q[i2].isEmpty() || this.Q[i3].isEmpty()) {
            return;
        }
        aot aotVar = (aot) this.Q[i2].get("ImageLength");
        aot aotVar2 = (aot) this.Q[i2].get("ImageWidth");
        aot aotVar3 = (aot) this.Q[i3].get("ImageLength");
        aot aotVar4 = (aot) this.Q[i3].get("ImageWidth");
        if (aotVar == null || aotVar2 == null || aotVar3 == null || aotVar4 == null) {
            return;
        }
        int a2 = aotVar.a(this.S);
        int a3 = aotVar2.a(this.S);
        int a4 = aotVar3.a(this.S);
        int a5 = aotVar4.a(this.S);
        if (a2 >= a4 || a3 >= a5) {
            return;
        }
        HashMap[] hashMapArr = this.Q;
        HashMap hashMap = hashMapArr[i2];
        hashMapArr[i2] = hashMapArr[i3];
        hashMapArr[i3] = hashMap;
    }

    private final void o() {
        n(0, 5);
        n(0, 4);
        n(5, 4);
        aot aotVar = (aot) this.Q[1].get("PixelXDimension");
        aot aotVar2 = (aot) this.Q[1].get("PixelYDimension");
        if (aotVar != null && aotVar2 != null) {
            this.Q[0].put("ImageWidth", aotVar);
            this.Q[0].put("ImageLength", aotVar2);
        }
        if (this.Q[4].isEmpty() && p(this.Q[5])) {
            HashMap[] hashMapArr = this.Q;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        p(this.Q[4]);
        l(0, "ThumbnailOrientation", "Orientation");
        l(0, "ThumbnailImageLength", "ImageLength");
        l(0, "ThumbnailImageWidth", "ImageWidth");
        l(5, "ThumbnailOrientation", "Orientation");
        l(5, "ThumbnailImageLength", "ImageLength");
        l(5, "ThumbnailImageWidth", "ImageWidth");
        l(4, "Orientation", "ThumbnailOrientation");
        l(4, "ImageLength", "ThumbnailImageLength");
        l(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private final boolean p(HashMap hashMap) {
        aot aotVar = (aot) hashMap.get("ImageLength");
        aot aotVar2 = (aot) hashMap.get("ImageWidth");
        if (aotVar == null || aotVar2 == null) {
            return false;
        }
        return aotVar.a(this.S) <= 512 && aotVar2.a(this.S) <= 512;
    }

    private final void q(aos aosVar) {
        aot aotVar;
        j(aosVar);
        r(aosVar, 0);
        s(aosVar, 0);
        s(aosVar, 5);
        s(aosVar, 4);
        o();
        if (this.P != 8 || (aotVar = (aot) this.Q[1].get("MakerNote")) == null) {
            return;
        }
        aos aosVar2 = new aos(aotVar.d, (byte[]) null);
        aosVar2.b = this.S;
        aosVar2.b(6);
        r(aosVar2, 9);
        aot aotVar2 = (aot) this.Q[9].get("ColorSpace");
        if (aotVar2 == null) {
            return;
        }
        this.Q[1].put("ColorSpace", aotVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
        if (r10 != 3) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
        if (r7 != 9) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
        if (r10 != 8) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void r(defpackage.aos r25, int r26) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aow.r(aos, int):void");
    }

    private final void s(aos aosVar, int i2) {
        aot e2;
        aot e3;
        aot aotVar = (aot) this.Q[i2].get("DefaultCropSize");
        aot aotVar2 = (aot) this.Q[i2].get("SensorTopBorder");
        aot aotVar3 = (aot) this.Q[i2].get("SensorLeftBorder");
        aot aotVar4 = (aot) this.Q[i2].get("SensorBottomBorder");
        aot aotVar5 = (aot) this.Q[i2].get("SensorRightBorder");
        if (aotVar != null) {
            if (aotVar.a == 5) {
                aov[] aovVarArr = (aov[]) aotVar.f(this.S);
                if (aovVarArr == null || aovVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(aovVarArr));
                    return;
                }
                e2 = aot.d(aovVarArr[0], this.S);
                e3 = aot.d(aovVarArr[1], this.S);
            } else {
                int[] iArr = (int[]) aotVar.f(this.S);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                e2 = aot.e(iArr[0], this.S);
                e3 = aot.e(iArr[1], this.S);
            }
            this.Q[i2].put("ImageWidth", e2);
            this.Q[i2].put("ImageLength", e3);
        } else if (aotVar2 == null || aotVar3 == null || aotVar4 == null || aotVar5 == null) {
            aot aotVar6 = (aot) this.Q[i2].get("ImageLength");
            aot aotVar7 = (aot) this.Q[i2].get("ImageWidth");
            if (aotVar6 != null && aotVar7 != null) {
                return;
            }
            aot aotVar8 = (aot) this.Q[i2].get("JPEGInterchangeFormat");
            aot aotVar9 = (aot) this.Q[i2].get("JPEGInterchangeFormatLength");
            if (aotVar8 == null || aotVar9 == null) {
                return;
            }
            int a2 = aotVar8.a(this.S);
            int a3 = aotVar8.a(this.S);
            aosVar.c(a2);
            byte[] bArr = new byte[a3];
            aosVar.read(bArr);
            e(new aos(bArr), a2, i2);
        } else {
            int a4 = aotVar2.a(this.S);
            int a5 = aotVar4.a(this.S);
            int a6 = aotVar5.a(this.S);
            int a7 = aotVar3.a(this.S);
            if (a5 <= a4 || a6 <= a7) {
                return;
            }
            aot e4 = aot.e(a5 - a4, this.S);
            aot e5 = aot.e(a6 - a7, this.S);
            this.Q[i2].put("ImageLength", e4);
            this.Q[i2].put("ImageWidth", e5);
        }
    }

    private static final ByteOrder t(aos aosVar) {
        short readShort = aosVar.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final String a(String str) {
        double d2;
        aot c2 = c(str);
        if (c2 != null) {
            if (!K.contains(str)) {
                return c2.g(this.S);
            }
            if (str.equals("GPSTimeStamp")) {
                int i2 = c2.a;
                if (i2 == 5 || i2 == 10) {
                    aov[] aovVarArr = (aov[]) c2.f(this.S);
                    if (aovVarArr == null || aovVarArr.length != 3) {
                        Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(aovVarArr));
                        return null;
                    }
                    aov aovVar = aovVarArr[0];
                    aov aovVar2 = aovVarArr[1];
                    aov aovVar3 = aovVarArr[2];
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) aovVar.a) / ((float) aovVar.b))), Integer.valueOf((int) (((float) aovVar2.a) / ((float) aovVar2.b))), Integer.valueOf((int) (((float) aovVar3.a) / ((float) aovVar3.b))));
                }
                Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + c2.a);
                return null;
            }
            try {
                Object f2 = c2.f(this.S);
                if (f2 == null) {
                    throw new NumberFormatException("NULL can't be converted to a double value");
                }
                if (f2 instanceof String) {
                    d2 = Double.parseDouble((String) f2);
                } else if (f2 instanceof long[]) {
                    long[] jArr = (long[]) f2;
                    if (jArr.length == 1) {
                        d2 = jArr[0];
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else if (f2 instanceof int[]) {
                    int[] iArr = (int[]) f2;
                    if (iArr.length == 1) {
                        d2 = iArr[0];
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else if (f2 instanceof double[]) {
                    double[] dArr = (double[]) f2;
                    if (dArr.length == 1) {
                        d2 = dArr[0];
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else if (f2 instanceof aov[]) {
                    aov[] aovVarArr2 = (aov[]) f2;
                    if (aovVarArr2.length == 1) {
                        aov aovVar4 = aovVarArr2[0];
                        double d3 = aovVar4.a;
                        double d4 = aovVar4.b;
                        Double.isNaN(d3);
                        Double.isNaN(d4);
                        d2 = d3 / d4;
                    } else {
                        throw new NumberFormatException("There are more than one component");
                    }
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
                return Double.toString(d2);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int b() {
        aot c2 = c("Orientation");
        if (c2 == null) {
            return 1;
        }
        try {
            return c2.a(this.S);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }
}
