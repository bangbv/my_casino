// automatically generated by the FlatBuffers compiler, do not modify

package vn.com.vng.gsmobile.casino.flatbuffers;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class UserStatusLoc extends Table {
  public static UserStatusLoc getRootAsUserStatusLoc(ByteBuffer _bb) { return getRootAsUserStatusLoc(_bb, new UserStatusLoc()); }
  public static UserStatusLoc getRootAsUserStatusLoc(ByteBuffer _bb, UserStatusLoc obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public UserStatusLoc __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public int status() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateStatus(int status) { int o = __offset(4); if (o != 0) { bb.put(o + bb_pos, (byte)status); return true; } else { return false; } }
  public int game() { int o = __offset(6); return o != 0 ? bb.get(o + bb_pos) & 0xFF : 0; }
  public boolean mutateGame(int game) { int o = __offset(6); if (o != 0) { bb.put(o + bb_pos, (byte)game); return true; } else { return false; } }
  public long roomId() { int o = __offset(8); return o != 0 ? bb.getLong(o + bb_pos) : 0; }
  public boolean mutateRoomId(long room_id) { int o = __offset(8); if (o != 0) { bb.putLong(o + bb_pos, room_id); return true; } else { return false; } }
  public String roomName() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer roomNameAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }

  public static int createUserStatusLoc(FlatBufferBuilder builder,
      int status,
      int game,
      long room_id,
      int room_nameOffset) {
    builder.startObject(4);
    UserStatusLoc.addRoomId(builder, room_id);
    UserStatusLoc.addRoomName(builder, room_nameOffset);
    UserStatusLoc.addGame(builder, game);
    UserStatusLoc.addStatus(builder, status);
    return UserStatusLoc.endUserStatusLoc(builder);
  }

  public static void startUserStatusLoc(FlatBufferBuilder builder) { builder.startObject(4); }
  public static void addStatus(FlatBufferBuilder builder, int status) { builder.addByte(0, (byte)status, 0); }
  public static void addGame(FlatBufferBuilder builder, int game) { builder.addByte(1, (byte)game, 0); }
  public static void addRoomId(FlatBufferBuilder builder, long roomId) { builder.addLong(2, roomId, 0); }
  public static void addRoomName(FlatBufferBuilder builder, int roomNameOffset) { builder.addOffset(3, roomNameOffset, 0); }
  public static int endUserStatusLoc(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

